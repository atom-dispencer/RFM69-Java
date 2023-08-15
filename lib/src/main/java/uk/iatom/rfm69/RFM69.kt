package uk.iatom.rfm69

import uk.iatom.rfm69.registers.ByteCodec
import uk.iatom.rfm69.registers.ByteRegisterValue
import uk.iatom.rfm69.registers.EnumCodec
import uk.iatom.rfm69.registers.IRegister
import uk.iatom.rfm69.registers.IRegisterFactory
import uk.iatom.rfm69.registers.values.Afc
import uk.iatom.rfm69.registers.values.Agc
import uk.iatom.rfm69.registers.values.AutoModes
import uk.iatom.rfm69.registers.values.BitRates
import uk.iatom.rfm69.registers.values.DataModulations
import uk.iatom.rfm69.registers.values.Dio
import uk.iatom.rfm69.registers.values.FifoThresh
import uk.iatom.rfm69.registers.values.FrequencyDeviations
import uk.iatom.rfm69.registers.values.Irq
import uk.iatom.rfm69.registers.values.Listen
import uk.iatom.rfm69.registers.values.Lna
import uk.iatom.rfm69.registers.values.LowBat
import uk.iatom.rfm69.registers.values.Ocp
import uk.iatom.rfm69.registers.values.Ook
import uk.iatom.rfm69.registers.values.OpModes
import uk.iatom.rfm69.registers.values.Osc1
import uk.iatom.rfm69.registers.values.Pa
import uk.iatom.rfm69.registers.values.Packet
import uk.iatom.rfm69.registers.values.PayloadLength
import uk.iatom.rfm69.registers.values.Preamble
import uk.iatom.rfm69.registers.values.Rssi
import uk.iatom.rfm69.registers.values.Rx
import uk.iatom.rfm69.registers.values.SyncConfig
import uk.iatom.rfm69.registers.values.Temp1
import uk.iatom.rfm69.registers.values.TestDagc
import uk.iatom.rfm69.registers.values.TestLna
import uk.iatom.rfm69.registers.values.Version

class RFM69(
        val factory: IRegisterFactory
           ) {


    inner class Registers {


        // @formatter:off
        private val OPMODE: IRegister<OpModes> = factory.create(EnumCodec(OpModes::class.java), 0x01)
        private val DATAMODUL: IRegister<DataModulations> = factory.create(EnumCodec(DataModulations::class.java),0x02)
        private val BITRATEMSB: IRegister<BitRates.Msb> = factory.create(EnumCodec(BitRates.Msb::class.java),0x03)
        private val BITRATELSB: IRegister<BitRates.Lsb> = factory.create(EnumCodec(BitRates.Lsb::class.java),0x04)
        private val FDEVMSB: IRegister<FrequencyDeviations.Msb> = factory.create(EnumCodec(FrequencyDeviations.Msb::class.java),0x05)
        private val FDEVLSB: IRegister<FrequencyDeviations.Lsb> = factory.create(EnumCodec(FrequencyDeviations.Lsb::class.java),0x06)
        private val FRFMSB: IRegister<> = factory.create(EnumCodec(FrequencyDeviations.Msb::class.java),0x07)
        private val FRFMID: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x08)
        private val FRFLSB: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x09)
        private val OSC1: IRegister<Osc1> = factory.create(EnumCodec(Osc1::class.java),0x0A)
        private val AFCCTRL: IRegister<Afc.Control> = factory.create(EnumCodec(Afc.Control::class.java),0x0B)
        private val LOWBAT: IRegister<LowBat> = factory.create(EnumCodec(LowBat::class.java),0x0C)
        private val LISTEN1: IRegister<Listen.L1> = factory.create(EnumCodec(Listen.L1::class.java),0x0D)
        private val LISTEN2: IRegister<Listen.L2> = factory.create(EnumCodec(Listen.L2::class.java),0x0E)
        private val LISTEN3: IRegister<Listen.L3> = factory.create(EnumCodec(Listen.L3::class.java),0x0F)
        private val VERSION: IRegister<Version> = factory.create(EnumCodec(Version::class.java),0x10)
        private val PALEVEL: IRegister<Pa.Levels> = factory.create(EnumCodec(Pa.Levels::class.java),0x11)
        private val PARAMP: IRegister<Pa.Ramps> = factory.create(EnumCodec(Pa.Ramps::class.java),0x12)
        private val OCP: IRegister<Ocp> = factory.create(EnumCodec(Ocp::class.java),0x13)
        private val AGCREF: IRegister<Agc.Refs> = factory.create(EnumCodec(Agc.Refs::class.java),0x14) // not present on RFM69/SX1231
        private val AGCTHRESH1: IRegister<Agc.Threshold1> = factory.create(EnumCodec(Agc.Threshold1::class.java),0x15) // not present on RFM69/SX1231
        private val AGCTHRESH2: IRegister<Agc.Threshold2> = factory.create(EnumCodec(Agc.Threshold2::class.java),0x16) // not present on RFM69/SX1231
        private val AGCTHRESH3: IRegister<Agc.Threshold3> = factory.create(EnumCodec(Agc.Threshold3::class.java),0x17) // not present on RFM69/SX1231
        private val LNA: IRegister<Lna> = factory.create(EnumCodec(Lna::class.java),0x18)
        private val RXBW: IRegister<Rx.Bw> = factory.create(EnumCodec(Rx.Bw::class.java),0x19)
        private val AFCBWS: IRegister<Afc.Bws> = factory.create(EnumCodec(Afc.Bws::class.java),0x1A)
        private val OOKPEAK: IRegister<Ook.Peaks> = factory.create(EnumCodec(Ook.Peaks::class.java),0x1B)
        private val OOKAVG: IRegister<Ook.Avg> = factory.create(EnumCodec(Ook.Avg::class.java),0x1C)
        private val OOKFIX: IRegister<Ook.Fix> = factory.create(EnumCodec(Ook.Fix::class.java),0x1D)
        private val AFCFEI: IRegister<Afc.Fei> = factory.create(EnumCodec(Afc.Fei::class.java),0x1E)
        private val AFCMSB: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x1F)
        private val AFCLSB: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x20)
        private val FEIMSB: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x21)
        private val FEILSB: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x22)
        private val RSSICONFIG: IRegister<Rssi.Config> = factory.create(EnumCodec(Rssi.Config::class.java),0x23)
        private val RSSITHRESH: IRegister<Rssi.Thresh> = factory.create(EnumCodec(Rssi.Thresh::class.java),0x29)
        private val RSSIVALUE: IRegister<> = factory.create(EnumCodec(Rssi.Thresh::class.java),0x24)
        private val DIOMAPPING1: IRegister<Dio.Mapping1> = factory.create(EnumCodec(Dio.Mapping1::class.java),0x25)
        private val DIOMAPPING2: IRegister<Dio.Mapping2> = factory.create(EnumCodec(Dio.Mapping2::class.java),0x26)
        private val IRQFLAGS1: IRegister<Irq.Flags1> = factory.create(EnumCodec(Irq.Flags1::class.java),0x27)
        private val IRQFLAGS2: IRegister<Irq.Flags2> = factory.create(EnumCodec(Irq.Flags2::class.java),0x28)
        private val RXTIMEOUT1: IRegister<Rx.Timeout1> = factory.create(EnumCodec(Rx.Timeout1::class.java),0x2A)
        private val RXTIMEOUT2: IRegister<Rx.Timeout2> = factory.create(EnumCodec(Rx.Timeout2::class.java),0x2B)
        private val PREAMBLEMSB: IRegister<Preamble.Msb> = factory.create(EnumCodec(Preamble.Msb::class.java),0x2C)
        private val PREAMBLELSB: IRegister<Preamble.Lsb> = factory.create(EnumCodec(Preamble.Lsb::class.java),0x2D)
        private val SYNCCONFIG: IRegister<SyncConfig> = factory.create(EnumCodec(SyncConfig::class.java),0x2E)
        private val SYNCVALUE1: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x2F)
        private val SYNCVALUE2: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x30)
        private val SYNCVALUE3: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x31)
        private val SYNCVALUE4: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x32)
        private val SYNCVALUE5: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x33)
        private val SYNCVALUE6: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x34)
        private val SYNCVALUE7: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x35)
        private val SYNCVALUE8: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x36)
        private val PACKETCONFIG1: IRegister<Packet.Config1> = factory.create(EnumCodec(Packet.Config1::class.java),0x37)
        private val PAYLOADLENGTH: IRegister<PayloadLength> = factory.create(EnumCodec(PayloadLength::class.java),0x38)
        private val NODEADRS: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x39)
        private val BROADCASTADRS: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x3A)
        private val AUTOMODES: IRegister<AutoModes> = factory.create(EnumCodec(AutoModes::class.java),0x3B)
        private val FIFOTHRESH: IRegister<FifoThresh> = factory.create(EnumCodec(FifoThresh::class.java),0x3C)
        private val PACKETCONFIG2: IRegister<Packet.Config2> = factory.create(EnumCodec(Packet.Config2::class.java),0x3D)
        private val AESKEY1: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x3E)
        private val AESKEY2: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x3F)
        private val AESKEY3: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x40)
        private val AESKEY4: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x41)
        private val AESKEY5: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x42)
        private val AESKEY6: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x43)
        private val AESKEY7: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x44)
        private val AESKEY8: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x45)
        private val AESKEY9: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x46)
        private val AESKEY10: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x47)
        private val AESKEY11: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x48)
        private val AESKEY12: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x49)
        private val AESKEY13: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x4A)
        private val AESKEY14: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x4B)
        private val AESKEY15: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x4C)
        private val AESKEY16: IRegister<ByteRegisterValue> = factory.create(ByteCodec(),0x4D)
        private val TEMP1: IRegister<Temp1> = factory.create(EnumCodec(Temp1::class.java),0x4E)
        private val TEMP2: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x4F)
        private val TESTLNA: IRegister<TestLna> = factory.create(EnumCodec(TestLna::class.java),0x58)
        private val TESTPA1: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x5A) // only present on RFM69HW/SX1231H);
        private val TESTPA2: IRegister<> = factory.create(EnumCodec(OpModes::class.java),0x5C) // only present on RFM69HW/SX1231H);
        private val TESTDAGC: IRegister<TestDagc> = factory.create(EnumCodec(TestDagc::class.java),0x6F)
        // @formatter:on
    }
}