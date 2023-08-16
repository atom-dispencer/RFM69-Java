package uk.iatom.rfm69

import uk.iatom.rfm69.register.ByteRegisterValue
import uk.iatom.rfm69.register.EnumCodec
import uk.iatom.rfm69.register.ICodec
import uk.iatom.rfm69.register.IRegister
import uk.iatom.rfm69.register.IRegisterBinding
import uk.iatom.rfm69.register.IRegisterGroup
import uk.iatom.rfm69.register.values.Afc
import uk.iatom.rfm69.register.values.Agc
import uk.iatom.rfm69.register.values.AutoModes
import uk.iatom.rfm69.register.values.BitRates
import uk.iatom.rfm69.register.values.CarrierFrf
import uk.iatom.rfm69.register.values.DataModulations
import uk.iatom.rfm69.register.values.Dio
import uk.iatom.rfm69.register.values.FifoThresh
import uk.iatom.rfm69.register.values.FrequencyDeviations
import uk.iatom.rfm69.register.values.Irq
import uk.iatom.rfm69.register.values.Listen
import uk.iatom.rfm69.register.values.Lna
import uk.iatom.rfm69.register.values.LowBat
import uk.iatom.rfm69.register.values.Ocp
import uk.iatom.rfm69.register.values.Ook
import uk.iatom.rfm69.register.values.OpModes
import uk.iatom.rfm69.register.values.Osc1
import uk.iatom.rfm69.register.values.Pa
import uk.iatom.rfm69.register.values.Packet
import uk.iatom.rfm69.register.values.PayloadLength
import uk.iatom.rfm69.register.values.Preamble
import uk.iatom.rfm69.register.values.Rssi
import uk.iatom.rfm69.register.values.Rx
import uk.iatom.rfm69.register.values.SyncConfig
import uk.iatom.rfm69.register.values.Temp1
import uk.iatom.rfm69.register.values.TestDagc
import uk.iatom.rfm69.register.values.TestLna
import uk.iatom.rfm69.register.values.Version

@Suppress(
        "PrivatePropertyName",
        "SpellCheckingInspection"
         )
class RFM69(
        private val registerFactory: IRegister.Factory,
        private val groupFactory: IRegisterGroup.Factory,
        private val bindingFactory: IRegisterBinding.Factory
           ) {


    // @formatter:off

        private fun <V> binding(codec: ICodec<V>, address: Byte): IRegisterBinding<V>
                = bindingFactory.newBinding(codec, registerFactory.newRegister(address))

        private fun brv(b: Byte): ByteRegisterValue = ByteRegisterValue(b)


        private val OPMODE = binding(OpModes.Codec(), 0x01)
        private val DATAMODUL = binding(DataModulations.Codec(), 0x02)
        private val BITRATEMSB = binding(EnumCodec(BitRates.Msb::class), 0x03)
        private val BITRATELSB = binding(EnumCodec(BitRates.Lsb::class), 0x04)
        private val BITRATE = groupFactory.newGroup(
                BitRates.GroupCodec(),
                BITRATEMSB,
                BITRATELSB
                                                   )
        private val FDEVMSB  = binding(EnumCodec(FrequencyDeviations.Msb::class),0x05)
        private val FDEVLSB  = binding(EnumCodec(FrequencyDeviations.Lsb::class),0x06)
        private val FDEV = groupFactory.newGroup(
                FrequencyDeviations.GroupCodec(),
                FDEVMSB,
                FDEVLSB
                                                )
        private val FRFMSB  = binding(EnumCodec(CarrierFrf.Msb::class), 0x07)
        private val FRFMID  = binding(EnumCodec(CarrierFrf.Mid::class), 0x08)
        private val FRFLSB  = binding(EnumCodec(CarrierFrf.Lsb::class), 0x09)
        private val CARRIERFRF = groupFactory.newGroup(
                CarrierFrf.GroupCodec(),
                FRFMSB,
                FRFMID,
                FRFLSB
                                                      )
        private val OSC1  = enumRegister(Osc1::class.java,0x0A)
        private val AFCCTRL  = enumRegister(Afc.Control::class.java,0x0B)
        private val LOWBAT  = enumRegister(LowBat::class.java,0x0C)
        private val LISTEN1  = enumRegister(Listen.L1::class.java,0x0D)
        private val LISTEN2  = enumRegister(Listen.L2::class.java,0x0E)
        private val LISTEN3  = enumRegister(Listen.L3::class.java,0x0F)
        private val VERSION  = enumRegister(Version::class.java,0x10)
        private val PALEVEL  = enumRegister(Pa.Levels::class.java,0x11)
        private val PARAMP  = enumRegister(Pa.Ramps::class.java,0x12)
        private val OCP  = enumRegister(Ocp::class.java,0x13)
        private val AGCREF  = enumRegister(Agc.Refs::class.java,0x14) // not present on RFM69/SX1231
        private val AGCTHRESH1  = enumRegister(Agc.Threshold1::class.java,0x15) // not present on RFM69/SX1231
        private val AGCTHRESH2  = enumRegister(Agc.Threshold2::class.java,0x16) // not present on RFM69/SX1231
        private val AGCTHRESH3  = enumRegister(Agc.Threshold3::class.java,0x17) // not present on RFM69/SX1231
        private val LNA  = enumRegister(Lna::class.java,0x18)
        private val RXBW  = enumRegister(Rx.Bw::class.java,0x19)
        private val AFCBWS  = enumRegister(Afc.Bws::class.java,0x1A)
        private val OOKPEAK  = enumRegister(Ook.Peaks::class.java,0x1B)
        private val OOKAVG  = enumRegister(Ook.Avg::class.java,0x1C)
        private val OOKFIX  = enumRegister(Ook.Fix::class.java,0x1D)
        private val AFCFEI  = enumRegister(Afc.Fei::class.java,0x1E)
        private val AFCMSB  = enumRegister(null,0x1F)
        private val AFCLSB  = enumRegister(null,0x20)
        private val FEIMSB  = enumRegister(null,0x21)
        private val FEILSB  = enumRegister(null,0x22)
        private val RSSICONFIG  = enumRegister(Rssi.Config::class.java,0x23)
        private val RSSITHRESH  = enumRegister(Rssi.Thresh::class.java,0x29)
        private val RSSIVALUE  = enumRegister(null,0x24)
        private val DIOMAPPING1  = enumRegister(Dio.Mapping1::class.java,0x25)
        private val DIOMAPPING2  = enumRegister(Dio.Mapping2::class.java,0x26)
        private val IRQFLAGS1  = enumRegister(Irq.Flags1::class.java,0x27)
        private val IRQFLAGS2  = enumRegister(Irq.Flags2::class.java,0x28)
        private val RXTIMEOUT1  = enumRegister(Rx.Timeout1::class.java,0x2A)
        private val RXTIMEOUT2  = enumRegister(Rx.Timeout2::class.java,0x2B)
        private val PREAMBLEMSB  = enumRegister(Preamble.Msb::class.java,0x2C)
        private val PREAMBLELSB  = enumRegister(Preamble.Lsb::class.java,0x2D)
        private val SYNCCONFIG  = enumRegister(SyncConfig::class.java,0x2E)
        private val SYNCVALUE1  = byteRegister(0x2F)
        private val SYNCVALUE2  = byteRegister(0x30)
        private val SYNCVALUE3  = byteRegister(0x31)
        private val SYNCVALUE4  = byteRegister(0x32)
        private val SYNCVALUE5  = byteRegister(0x33)
        private val SYNCVALUE6  = byteRegister(0x34)
        private val SYNCVALUE7  = byteRegister(0x35)
        private val SYNCVALUE8  = byteRegister(0x36)
        private val SYNCVALUE: IRegisterGroup      = factory.group(
                                                                            SYNCVALUE1, SYNCVALUE2,
                                                                            SYNCVALUE3, SYNCVALUE4,
                                                                            SYNCVALUE5, SYNCVALUE6,
                                                                            SYNCVALUE7, SYNCVALUE8
                                                                                           )
        private val PACKETCONFIG1  = enumRegister(Packet.Config1::class.java,0x37)
        private val PAYLOADLENGTH  = enumRegister(PayloadLength::class.java,0x38)
        private val NODEADRS  = byteRegister(0x39)
        private val BROADCASTADRS  = byteRegister(0x3A)
        private val AUTOMODES  = enumRegister(AutoModes::class.java,0x3B)
        private val FIFOTHRESH  = enumRegister(FifoThresh::class.java,0x3C)
        private val PACKETCONFIG2  = enumRegister(Packet.Config2::class.java,0x3D)
        private val AESKEY1  = byteRegister(0x3E)
        private val AESKEY2  = byteRegister(0x3F)
        private val AESKEY3  = byteRegister(0x40)
        private val AESKEY4  = byteRegister(0x41)
        private val AESKEY5  = byteRegister(0x42)
        private val AESKEY6  = byteRegister(0x43)
        private val AESKEY7  = byteRegister(0x44)
        private val AESKEY8  = byteRegister(0x45)
        private val AESKEY9  = byteRegister(0x46)
        private val AESKEY10  = byteRegister(0x47)
        private val AESKEY11  = byteRegister(0x48)
        private val AESKEY12  = byteRegister(0x49)
        private val AESKEY13  = byteRegister(0x4A)
        private val AESKEY14  = byteRegister(0x4B)
        private val AESKEY15  = byteRegister(0x4C)
        private val AESKEY16  = byteRegister(0x4D)
        private val AESKEY: IRegisterGroup      = factory.group(
                                                                              AESKEY1, AESKEY2,
                                                                              AESKEY3, AESKEY4,
                                                                              AESKEY5, AESKEY6,
                                                                              AESKEY7, AESKEY8,
                                                                              AESKEY9, AESKEY10,
                                                                              AESKEY11, AESKEY12,
                                                                              AESKEY13, AESKEY14,
                                                                              AESKEY15, AESKEY16
                                                                                          )
        private val TEMP1  = enumRegister(Temp1::class.java,0x4E)
        private val TEMP2  = enumRegister(null,0x4F)
        private val TESTLNA  = enumRegister(TestLna::class.java,0x58)
        private val TESTPA1  = enumRegister(null,0x5A) // only present on RFM69HW/SX1231H);
        private val TESTPA2  = enumRegister(null,0x5C) // only present on RFM69HW/SX1231H);
        private val TESTDAGC  = enumRegister(TestDagc::class.java,0x6F)
        // @formatter:on


    fun initRegisters() {


        OPMODE.writeEncoded(OpModes())
        DATAMODUL.writeEncoded(DataModulations())
        BITRATE.groupWrite(BitRates())
        FDEVMSB.write(FrequencyDeviations.MSB_DEFAULT)
        FDEVLSB.write(FrequencyDeviations.LSB_DEFAULT)
    }
}