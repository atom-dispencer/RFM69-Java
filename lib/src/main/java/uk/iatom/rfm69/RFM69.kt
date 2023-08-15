package uk.iatom.rfm69

import uk.iatom.rfm69.registers.SingleRegister
import uk.iatom.rfm69.registers.values.BitRates
import uk.iatom.rfm69.registers.values.DataModulations
import uk.iatom.rfm69.registers.values.EnumCodec
import uk.iatom.rfm69.registers.values.FifoThresh
import uk.iatom.rfm69.registers.values.FrequencyDeviations
import uk.iatom.rfm69.registers.values.OpModes

class RFM69(val chip: IPeripheral) {


    private val FIFO = SingleRegister(
            EnumCodec(FifoThresh::class.java),
            chip,
            0x00
                                     )
    private val OPMODE: SingleRegister<OpModes> = SingleRegister(
            XXX,
            YYY,
            0x01
                                                                )
    private val DATAMODUL: SingleRegister<DataModulations> = SingleRegister(
            XXX,
            YYY,
            0x02
                                                                           )
    private val BITRATEMSB: CompoundRegister<BitRates.Msb> = CompoundRegister(
            XXX,
            YYY,
            0x03
                                                                             )
    private val BITRATELSB: CompoundRegister<BitRates.Lsb> = CompoundRegister(
            XXX,
            YYY,
            0x04
                                                                             )
    private val FDEVMSB: SingleRegister<FrequencyDeviations.Msb> = SingleRegister(
            XXX,
            YYY,
            0x05
                                                                                 )
    private val FDEVLSB: SingleRegister<FrequencyDeviations.Lsb> = SingleRegister(
            XXX,
            YYY,
            0x06
                                                                                 )
    private val FRFMSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x07
                                                    )
    private val FRFMID: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x08
                                                    )
    private val FRFLSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x09
                                                    )
    private val OSC1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0A
                                                  )
    private val AFCCTRL: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0B
                                                     )
    private val LOWBAT: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0C
                                                    )
    private val LISTEN1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0D
                                                     )
    private val LISTEN2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0E
                                                     )
    private val LISTEN3: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x0F
                                                     )
    private val VERSION: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x10
                                                     )
    private val PALEVEL: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x11
                                                     )
    private val PARAMP: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x12
                                                    )
    private val OCP: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x13
                                                 )
    private val AGCREF: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x14
                                                    ) // not present on RFM69/SX1231
    private val AGCTHRESH1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x15
                                                        ) // not present on RFM69/SX1231
    private val AGCTHRESH2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x16
                                                        ) // not present on RFM69/SX1231
    private val AGCTHRESH3: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x17
                                                        ) // not present on RFM69/SX1231
    private val LNA: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x18
                                                 )
    private val RXBW: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x19
                                                  )
    private val AFCBW: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1A
                                                   )
    private val OOKPEAK: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1B
                                                     )
    private val OOKAVG: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1C
                                                    )
    private val OOKFIX: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1D
                                                    )
    private val AFCFEI: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1E
                                                    )
    private val AFCMSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x1F
                                                    )
    private val AFCLSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x20
                                                    )
    private val FEIMSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x21
                                                    )
    private val FEILSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x22
                                                    )
    private val RSSICONFIG: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x23
                                                        )
    private val RSSIVALUE: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x24
                                                       )
    private val DIOMAPPING1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x25
                                                         )
    private val DIOMAPPING2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x26
                                                         )
    private val IRQFLAGS1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x27
                                                       )
    private val IRQFLAGS2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x28
                                                       )
    private val RSSITHRESH: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x29
                                                        )
    private val RXTIMEOUT1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2A
                                                        )
    private val RXTIMEOUT2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2B
                                                        )
    private val PREAMBLEMSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2C
                                                         )
    private val PREAMBLELSB: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2D
                                                         )
    private val SYNCCONFIG: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2E
                                                        )
    private val SYNCVALUE1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x2F
                                                        )
    private val SYNCVALUE2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x30
                                                        )
    private val SYNCVALUE3: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x31
                                                        )
    private val SYNCVALUE4: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x32
                                                        )
    private val SYNCVALUE5: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x33
                                                        )
    private val SYNCVALUE6: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x34
                                                        )
    private val SYNCVALUE7: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x35
                                                        )
    private val SYNCVALUE8: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x36
                                                        )
    private val PACKETCONFIG1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x37
                                                           )
    private val PAYLOADLENGTH: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x38
                                                           )
    private val NODEADRS: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x39
                                                      )
    private val BROADCASTADRS: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3A
                                                           )
    private val AUTOMODES: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3B
                                                       )
    private val FIFOTHRESH: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3C
                                                        )
    private val PACKETCONFIG2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3D
                                                           )
    private val AESKEY1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3E
                                                     )
    private val AESKEY2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x3F
                                                     )
    private val AESKEY3: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x40
                                                     )
    private val AESKEY4: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x41
                                                     )
    private val AESKEY5: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x42
                                                     )
    private val AESKEY6: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x43
                                                     )
    private val AESKEY7: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x44
                                                     )
    private val AESKEY8: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x45
                                                     )
    private val AESKEY9: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x46
                                                     )
    private val AESKEY10: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x47
                                                      )
    private val AESKEY11: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x48
                                                      )
    private val AESKEY12: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x49
                                                      )
    private val AESKEY13: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4A
                                                      )
    private val AESKEY14: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4B
                                                      )
    private val AESKEY15: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4C
                                                      )
    private val AESKEY16: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4D
                                                      )
    private val TEMP1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4E
                                                   )
    private val TEMP2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x4F
                                                   )
    private val TESTLNA: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x58
                                                     )
    private val TESTPA1: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x5A
                                                     ) // only present on RFM69HW/SX1231H);
    private val TESTPA2: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x5C
                                                     ) // only present on RFM69HW/SX1231H);
    private val TESTDAGC: SingleRegister<*> = Register(
            XXX,
            YYY,
            0x6F
                                                      )
}
