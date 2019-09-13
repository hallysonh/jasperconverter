package com.hallyson.jasperconverter

import net.sf.jasperreports.engine.JRException
import net.sf.jasperreports.engine.JasperExportManager

const val EXT = ".JRPRINT"

fun main(args: Array<String>) {
    try {
        args.forEach { println(it) }
        if (args.isEmpty() || !args[0].toUpperCase().endsWith(EXT)) {
            return
        }
        val strFileIn = args[0]
        val indexIndex = strFileIn.toUpperCase().indexOf(EXT)
        val strFileOut = strFileIn.substring(0, indexIndex) + ".pdf"
        JasperExportManager.exportReportToPdfFile(strFileIn, strFileOut)
        println("Arquivo convertido com sucesso para: $strFileOut");
    } catch (e: JRException) {
        println("Falha ao converter arquivo: " + e.message)
        e.printStackTrace()
    }
}