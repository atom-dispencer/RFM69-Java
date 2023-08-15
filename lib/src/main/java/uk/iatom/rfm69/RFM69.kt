package uk.iatom.rfm69

import uk.iatom.rfm69.register.ByteCodec
import uk.iatom.rfm69.register.ByteRegisterValue
import uk.iatom.rfm69.register.EnumCodec
import uk.iatom.rfm69.register.IRegister
import uk.iatom.rfm69.register.IRegisterFactory
import uk.iatom.rfm69.register.IRegisterValue
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

class RFM69(
        val factory: IRegisterFactory
           ) {


    inner class Registers {
        // @formatter:off


        private fun <V> enumRegister(clazz: Class<V>, address: Byte)
                : IRegister<V> where V: Enum<V>, V: IRegisterValue {
            return factory.create(EnumCodec(clazz), address)
        }

        private fun byteRegister(address: Byte)
                : IRegister<ByteRegisterValue> {
            return factory.create(ByteCodec(), address)
        }


        private val OPMODE: IRegister<OpModes>                     = enumRegister(OpModes::class.java, 0x01)
        private val DATAMODUL: IRegister<DataModulations>          = enumRegister(DataModulations::class.java,0x02)
        private val BITRATEMSB: IRegister<BitRates.Msb>            = enumRegister(BitRates.Msb::class.java,0x03)
        private val BITRATELSB: IRegister<BitRates.Lsb>            = enumRegister(BitRates.Lsb::class.java,0x04)
        private val FDEVMSB: IRegister<FrequencyDeviations.Msb>    = enumRegister(FrequencyDeviations.Msb::class.java,0x05)
        private val FDEVLSB: IRegister<FrequencyDeviations.Lsb>    = enumRegister(FrequencyDeviations.Lsb::class.java,0x06)
        private val FRFMSB: IRegister<>                            = enumRegister(null,0x07)
        private val FRFMID: IRegister<>                            = enumRegister(null,0x08)
        private val FRFLSB: IRegister<>                            = enumRegister(null,0x09)
        private val OSC1: IRegister<Osc1>                          = enumRegister(Osc1::class.java,0x0A)
        private val AFCCTRL: IRegister<Afc.Control>                = enumRegister(Afc.Control::class.java,0x0B)
        private val LOWBAT: IRegister<LowBat>                      = enumRegister(LowBat::class.java,0x0C)
        private val LISTEN1: IRegister<Listen.L1>                  = enumRegister(Listen.L1::class.java,0x0D)
        private val LISTEN2: IRegister<Listen.L2>                  = enumRegister(Listen.L2::class.java,0x0E)
        private val LISTEN3: IRegister<Listen.L3>                  = enumRegister(Listen.L3::class.java,0x0F)
        private val VERSION: IRegister<Version>                    = enumRegister(Version::class.java,0x10)
        private val PALEVEL: IRegister<Pa.Levels>                  = enumRegister(Pa.Levels::class.java,0x11)
        private val PARAMP: IRegister<Pa.Ramps>                    = enumRegister(Pa.Ramps::class.java,0x12)
        private val OCP: IRegister<Ocp>                            = enumRegister(Ocp::class.java,0x13)
        private val AGCREF: IRegister<Agc.Refs>                    = enumRegister(Agc.Refs::class.java,0x14) // not present on RFM69/SX1231
        private val AGCTHRESH1: IRegister<Agc.Threshold1>          = enumRegister(Agc.Threshold1::class.java,0x15) // not present on RFM69/SX1231
        private val AGCTHRESH2: IRegister<Agc.Threshold2>          = enumRegister(Agc.Threshold2::class.java,0x16) // not present on RFM69/SX1231
        private val AGCTHRESH3: IRegister<Agc.Threshold3>          = enumRegister(Agc.Threshold3::class.java,0x17) // not present on RFM69/SX1231
        private val LNA: IRegister<Lna>                            = enumRegister(Lna::class.java,0x18)
        private val RXBW: IRegister<Rx.Bw>                         = enumRegister(Rx.Bw::class.java,0x19)
        private val AFCBWS: IRegister<Afc.Bws>                     = enumRegister(Afc.Bws::class.java,0x1A)
        private val OOKPEAK: IRegister<Ook.Peaks>                  = enumRegister(Ook.Peaks::class.java,0x1B)
        private val OOKAVG: IRegister<Ook.Avg>                     = enumRegister(Ook.Avg::class.java,0x1C)
        private val OOKFIX: IRegister<Ook.Fix>                     = enumRegister(Ook.Fix::class.java,0x1D)
        private val AFCFEI: IRegister<Afc.Fei>                     = enumRegister(Afc.Fei::class.java,0x1E)
        private val AFCMSB: IRegister<>                            = enumRegister(null,0x1F)
        private val AFCLSB: IRegister<>                            = enumRegister(null,0x20)
        private val FEIMSB: IRegister<>                            = enumRegister(null,0x21)
        private val FEILSB: IRegister<>                            = enumRegister(null,0x22)
        private val RSSICONFIG: IRegister<Rssi.Config>             = enumRegister(Rssi.Config::class.java,0x23)
        private val RSSITHRESH: IRegister<Rssi.Thresh>             = enumRegister(Rssi.Thresh::class.java,0x29)
        private val RSSIVALUE: IRegister<>                         = enumRegister(null,0x24)
        private val DIOMAPPING1: IRegister<Dio.Mapping1>           = enumRegister(Dio.Mapping1::class.java,0x25)
        private val DIOMAPPING2: IRegister<Dio.Mapping2>           = enumRegister(Dio.Mapping2::class.java,0x26)
        private val IRQFLAGS1: IRegister<Irq.Flags1>               = enumRegister(Irq.Flags1::class.java,0x27)
        private val IRQFLAGS2: IRegister<Irq.Flags2>               = enumRegister(Irq.Flags2::class.java,0x28)
        private val RXTIMEOUT1: IRegister<Rx.Timeout1>             = enumRegister(Rx.Timeout1::class.java,0x2A)
        private val RXTIMEOUT2: IRegister<Rx.Timeout2>             = enumRegister(Rx.Timeout2::class.java,0x2B)
        private val PREAMBLEMSB: IRegister<Preamble.Msb>           = enumRegister(Preamble.Msb::class.java,0x2C)
        private val PREAMBLELSB: IRegister<Preamble.Lsb>           = enumRegister(Preamble.Lsb::class.java,0x2D)
        private val SYNCCONFIG: IRegister<SyncConfig>              = enumRegister(SyncConfig::class.java,0x2E)
        private val SYNCVALUE1: IRegister<ByteRegisterValue>       = byteRegister(0x2F)
        private val SYNCVALUE2: IRegister<ByteRegisterValue>       = byteRegister(0x30)
        private val SYNCVALUE3: IRegister<ByteRegisterValue>       = byteRegister(0x31)
        private val SYNCVALUE4: IRegister<ByteRegisterValue>       = byteRegister(0x32)
        private val SYNCVALUE5: IRegister<ByteRegisterValue>       = byteRegister(0x33)
        private val SYNCVALUE6: IRegister<ByteRegisterValue>       = byteRegister(0x34)
        private val SYNCVALUE7: IRegister<ByteRegisterValue>       = byteRegister(0x35)
        private val SYNCVALUE8: IRegister<ByteRegisterValue>       = byteRegister(0x36)
        private val PACKETCONFIG1: IRegister<Packet.Config1>       = enumRegister(Packet.Config1::class.java,0x37)
        private val PAYLOADLENGTH: IRegister<PayloadLength>        = enumRegister(PayloadLength::class.java,0x38)
        private val NODEADRS: IRegister<ByteRegisterValue>         = byteRegister(0x39)
        private val BROADCASTADRS: IRegister<ByteRegisterValue>    = byteRegister(0x3A)
        private val AUTOMODES: IRegister<AutoModes>                = enumRegister(AutoModes::class.java,0x3B)
        private val FIFOTHRESH: IRegister<FifoThresh>              = enumRegister(FifoThresh::class.java,0x3C)
        private val PACKETCONFIG2: IRegister<Packet.Config2>       = enumRegister(Packet.Config2::class.java,0x3D)
        private val AESKEY1: IRegister<ByteRegisterValue>          = byteRegister(0x3E)
        private val AESKEY2: IRegister<ByteRegisterValue>          = byteRegister(0x3F)
        private val AESKEY3: IRegister<ByteRegisterValue>          = byteRegister(0x40)
        private val AESKEY4: IRegister<ByteRegisterValue>          = byteRegister(0x41)
        private val AESKEY5: IRegister<ByteRegisterValue>          = byteRegister(0x42)
        private val AESKEY6: IRegister<ByteRegisterValue>          = byteRegister(0x43)
        private val AESKEY7: IRegister<ByteRegisterValue>          = byteRegister(0x44)
        private val AESKEY8: IRegister<ByteRegisterValue>          = byteRegister(0x45)
        private val AESKEY9: IRegister<ByteRegisterValue>          = byteRegister(0x46)
        private val AESKEY10: IRegister<ByteRegisterValue>         = byteRegister(0x47)
        private val AESKEY11: IRegister<ByteRegisterValue>         = byteRegister(0x48)
        private val AESKEY12: IRegister<ByteRegisterValue>         = byteRegister(0x49)
        private val AESKEY13: IRegister<ByteRegisterValue>         = byteRegister(0x4A)
        private val AESKEY14: IRegister<ByteRegisterValue>         = byteRegister(0x4B)
        private val AESKEY15: IRegister<ByteRegisterValue>         = byteRegister(0x4C)
        private val AESKEY16: IRegister<ByteRegisterValue>         = byteRegister(0x4D)
        private val TEMP1: IRegister<Temp1>                        = enumRegister(Temp1::class.java,0x4E)
        private val TEMP2: IRegister<>                             = enumRegister(null,0x4F)
        private val TESTLNA: IRegister<TestLna>                    = enumRegister(TestLna::class.java,0x58)
        private val TESTPA1: IRegister<>                           = enumRegister(null,0x5A) // only present on RFM69HW/SX1231H);
        private val TESTPA2: IRegister<>                           = enumRegister(null,0x5C) // only present on RFM69HW/SX1231H);
        private val TESTDAGC: IRegister<TestDagc>                  = enumRegister(TestDagc::class.java,0x6F)
        // @formatter:on
    }
}