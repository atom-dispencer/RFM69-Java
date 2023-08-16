package uk.iatom.rfm69

import uk.iatom.rfm69.register.ByteCodec
import uk.iatom.rfm69.register.ByteRegisterValue
import uk.iatom.rfm69.register.EnumCodec
import uk.iatom.rfm69.register.ICompoundRegister
import uk.iatom.rfm69.register.IRegisterFactory
import uk.iatom.rfm69.register.IRegisterValue
import uk.iatom.rfm69.register.ISingleRegister
import uk.iatom.rfm69.register.values.Afc
import uk.iatom.rfm69.register.values.Agc
import uk.iatom.rfm69.register.values.AutoModes
import uk.iatom.rfm69.register.values.BitRates
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

class RFM69(private val factory: IRegisterFactory) {


    // @formatter:off

        private fun <V> enumRegister(clazz: Class<V>, address: Byte)
                : ISingleRegister<V> where V: Enum<V>, V: IRegisterValue {
            return factory.single(EnumCodec(clazz), address)
        }

        private fun byteRegister(address: Byte)
                : ISingleRegister<ByteRegisterValue> {
            return factory.single(ByteCodec(), address)
        }

        private fun brv(b: Byte): ByteRegisterValue = ByteRegisterValue(b)


        private val OPMODE: ISingleRegister<OpModes>                     = factory.single(OpModes.Codec(), 0x01)
        private val DATAMODUL: ISingleRegister<DataModulations>          = factory.single(DataModulations.Codec(), 0x02)
        private val BITRATEMSB: ISingleRegister<BitRates.Msb>            = enumRegister(BitRates.Msb::class.java,0x03)
        private val BITRATELSB: ISingleRegister<BitRates.Lsb>            = enumRegister(BitRates.Lsb::class.java,0x04)
        private val FDEVMSB: ISingleRegister<FrequencyDeviations.Msb>    = enumRegister(FrequencyDeviations.Msb::class.java,0x05)
        private val FDEVLSB: ISingleRegister<FrequencyDeviations.Lsb>    = enumRegister(FrequencyDeviations.Lsb::class.java,0x06)
        private val FRFMSB: ISingleRegister<>                            = enumRegister(null,0x07)
        private val FRFMID: ISingleRegister<>                            = enumRegister(null,0x08)
        private val FRFLSB: ISingleRegister<>                            = enumRegister(null,0x09)
        private val OSC1: ISingleRegister<Osc1>                          = enumRegister(Osc1::class.java,0x0A)
        private val AFCCTRL: ISingleRegister<Afc.Control>                = enumRegister(Afc.Control::class.java,0x0B)
        private val LOWBAT: ISingleRegister<LowBat>                      = enumRegister(LowBat::class.java,0x0C)
        private val LISTEN1: ISingleRegister<Listen.L1>                  = enumRegister(Listen.L1::class.java,0x0D)
        private val LISTEN2: ISingleRegister<Listen.L2>                  = enumRegister(Listen.L2::class.java,0x0E)
        private val LISTEN3: ISingleRegister<Listen.L3>                  = enumRegister(Listen.L3::class.java,0x0F)
        private val VERSION: ISingleRegister<Version>                    = enumRegister(Version::class.java,0x10)
        private val PALEVEL: ISingleRegister<Pa.Levels>                  = enumRegister(Pa.Levels::class.java,0x11)
        private val PARAMP: ISingleRegister<Pa.Ramps>                    = enumRegister(Pa.Ramps::class.java,0x12)
        private val OCP: ISingleRegister<Ocp>                            = enumRegister(Ocp::class.java,0x13)
        private val AGCREF: ISingleRegister<Agc.Refs>                    = enumRegister(Agc.Refs::class.java,0x14) // not present on RFM69/SX1231
        private val AGCTHRESH1: ISingleRegister<Agc.Threshold1>          = enumRegister(Agc.Threshold1::class.java,0x15) // not present on RFM69/SX1231
        private val AGCTHRESH2: ISingleRegister<Agc.Threshold2>          = enumRegister(Agc.Threshold2::class.java,0x16) // not present on RFM69/SX1231
        private val AGCTHRESH3: ISingleRegister<Agc.Threshold3>          = enumRegister(Agc.Threshold3::class.java,0x17) // not present on RFM69/SX1231
        private val LNA: ISingleRegister<Lna>                            = enumRegister(Lna::class.java,0x18)
        private val RXBW: ISingleRegister<Rx.Bw>                         = enumRegister(Rx.Bw::class.java,0x19)
        private val AFCBWS: ISingleRegister<Afc.Bws>                     = enumRegister(Afc.Bws::class.java,0x1A)
        private val OOKPEAK: ISingleRegister<Ook.Peaks>                  = enumRegister(Ook.Peaks::class.java,0x1B)
        private val OOKAVG: ISingleRegister<Ook.Avg>                     = enumRegister(Ook.Avg::class.java,0x1C)
        private val OOKFIX: ISingleRegister<Ook.Fix>                     = enumRegister(Ook.Fix::class.java,0x1D)
        private val AFCFEI: ISingleRegister<Afc.Fei>                     = enumRegister(Afc.Fei::class.java,0x1E)
        private val AFCMSB: ISingleRegister<>                            = enumRegister(null,0x1F)
        private val AFCLSB: ISingleRegister<>                            = enumRegister(null,0x20)
        private val FEIMSB: ISingleRegister<>                            = enumRegister(null,0x21)
        private val FEILSB: ISingleRegister<>                            = enumRegister(null,0x22)
        private val RSSICONFIG: ISingleRegister<Rssi.Config>             = enumRegister(Rssi.Config::class.java,0x23)
        private val RSSITHRESH: ISingleRegister<Rssi.Thresh>             = enumRegister(Rssi.Thresh::class.java,0x29)
        private val RSSIVALUE: ISingleRegister<>                         = enumRegister(null,0x24)
        private val DIOMAPPING1: ISingleRegister<Dio.Mapping1>           = enumRegister(Dio.Mapping1::class.java,0x25)
        private val DIOMAPPING2: ISingleRegister<Dio.Mapping2>           = enumRegister(Dio.Mapping2::class.java,0x26)
        private val IRQFLAGS1: ISingleRegister<Irq.Flags1>               = enumRegister(Irq.Flags1::class.java,0x27)
        private val IRQFLAGS2: ISingleRegister<Irq.Flags2>               = enumRegister(Irq.Flags2::class.java,0x28)
        private val RXTIMEOUT1: ISingleRegister<Rx.Timeout1>             = enumRegister(Rx.Timeout1::class.java,0x2A)
        private val RXTIMEOUT2: ISingleRegister<Rx.Timeout2>             = enumRegister(Rx.Timeout2::class.java,0x2B)
        private val PREAMBLEMSB: ISingleRegister<Preamble.Msb>           = enumRegister(Preamble.Msb::class.java,0x2C)
        private val PREAMBLELSB: ISingleRegister<Preamble.Lsb>           = enumRegister(Preamble.Lsb::class.java,0x2D)
        private val SYNCCONFIG: ISingleRegister<SyncConfig>              = enumRegister(SyncConfig::class.java,0x2E)
        private val SYNCVALUE1: ISingleRegister<ByteRegisterValue>       = byteRegister(0x2F)
        private val SYNCVALUE2: ISingleRegister<ByteRegisterValue>       = byteRegister(0x30)
        private val SYNCVALUE3: ISingleRegister<ByteRegisterValue>       = byteRegister(0x31)
        private val SYNCVALUE4: ISingleRegister<ByteRegisterValue>       = byteRegister(0x32)
        private val SYNCVALUE5: ISingleRegister<ByteRegisterValue>       = byteRegister(0x33)
        private val SYNCVALUE6: ISingleRegister<ByteRegisterValue>       = byteRegister(0x34)
        private val SYNCVALUE7: ISingleRegister<ByteRegisterValue>       = byteRegister(0x35)
        private val SYNCVALUE8: ISingleRegister<ByteRegisterValue>       = byteRegister(0x36)
        private val SYNCVALUE: ICompoundRegister<ByteRegisterValue>      = factory.compound(
                                                                            SYNCVALUE1, SYNCVALUE2,
                                                                            SYNCVALUE3, SYNCVALUE4,
                                                                            SYNCVALUE5, SYNCVALUE6,
                                                                            SYNCVALUE7, SYNCVALUE8
                                                                                           )
        private val PACKETCONFIG1: ISingleRegister<Packet.Config1>       = enumRegister(Packet.Config1::class.java,0x37)
        private val PAYLOADLENGTH: ISingleRegister<PayloadLength>        = enumRegister(PayloadLength::class.java,0x38)
        private val NODEADRS: ISingleRegister<ByteRegisterValue>         = byteRegister(0x39)
        private val BROADCASTADRS: ISingleRegister<ByteRegisterValue>    = byteRegister(0x3A)
        private val AUTOMODES: ISingleRegister<AutoModes>                = enumRegister(AutoModes::class.java,0x3B)
        private val FIFOTHRESH: ISingleRegister<FifoThresh>              = enumRegister(FifoThresh::class.java,0x3C)
        private val PACKETCONFIG2: ISingleRegister<Packet.Config2>       = enumRegister(Packet.Config2::class.java,0x3D)
        private val AESKEY1: ISingleRegister<ByteRegisterValue>          = byteRegister(0x3E)
        private val AESKEY2: ISingleRegister<ByteRegisterValue>          = byteRegister(0x3F)
        private val AESKEY3: ISingleRegister<ByteRegisterValue>          = byteRegister(0x40)
        private val AESKEY4: ISingleRegister<ByteRegisterValue>          = byteRegister(0x41)
        private val AESKEY5: ISingleRegister<ByteRegisterValue>          = byteRegister(0x42)
        private val AESKEY6: ISingleRegister<ByteRegisterValue>          = byteRegister(0x43)
        private val AESKEY7: ISingleRegister<ByteRegisterValue>          = byteRegister(0x44)
        private val AESKEY8: ISingleRegister<ByteRegisterValue>          = byteRegister(0x45)
        private val AESKEY9: ISingleRegister<ByteRegisterValue>          = byteRegister(0x46)
        private val AESKEY10: ISingleRegister<ByteRegisterValue>         = byteRegister(0x47)
        private val AESKEY11: ISingleRegister<ByteRegisterValue>         = byteRegister(0x48)
        private val AESKEY12: ISingleRegister<ByteRegisterValue>         = byteRegister(0x49)
        private val AESKEY13: ISingleRegister<ByteRegisterValue>         = byteRegister(0x4A)
        private val AESKEY14: ISingleRegister<ByteRegisterValue>         = byteRegister(0x4B)
        private val AESKEY15: ISingleRegister<ByteRegisterValue>         = byteRegister(0x4C)
        private val AESKEY16: ISingleRegister<ByteRegisterValue>         = byteRegister(0x4D)
        private val AESKEY: ICompoundRegister<ByteRegisterValue>        = factory.compound(
                                                                              AESKEY1, AESKEY2,
                                                                              AESKEY3, AESKEY4,
                                                                              AESKEY5, AESKEY6,
                                                                              AESKEY7, AESKEY8,
                                                                              AESKEY9, AESKEY10,
                                                                                      AESKEY11, AESKEY12,
                                                                              AESKEY13, AESKEY14,
                                                                              AESKEY15, AESKEY16
                                                                                          )
        private val TEMP1: ISingleRegister<Temp1>                        = enumRegister(Temp1::class.java,0x4E)
        private val TEMP2: ISingleRegister<>                             = enumRegister(null,0x4F)
        private val TESTLNA: ISingleRegister<TestLna>                    = enumRegister(TestLna::class.java,0x58)
        private val TESTPA1: ISingleRegister<>                           = enumRegister(null,0x5A) // only present on RFM69HW/SX1231H);
        private val TESTPA2: ISingleRegister<>                           = enumRegister(null,0x5C) // only present on RFM69HW/SX1231H);
        private val TESTDAGC: ISingleRegister<TestDagc>                  = enumRegister(TestDagc::class.java,0x6F)
        // @formatter:on


    fun initChip() {
        OPMODE.write(OpModes())
        DATAMODUL.write(DataModulations())
    }
}