package com.example.comicsproject.line1.model.htmlparser

import android.util.Log
import com.example.comicsproject.line1.bean.HtmlData
import com.example.comicsproject.line1.bean.RecyclerViewCell
import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler
import java.util.ArrayList

class MyContentHandler:DefaultHandler() {
    private val TAG = "MyContentHandler"
    private var currentNodeName:String?=null
    private var divClass:String?=null

    var htmlData: HtmlData?=null
    private var liClass:String?=null
    private var listItem:RecyclerViewCell?=null
    private var pClass:String?=null
    override fun startDocument() {
//        Log.d(TAG, "startDocument() called")
        super.startDocument()
        htmlData= HtmlData(ArrayList())
    }

    override fun startElement(
        uri: String?,
        localName: String?,
        qName: String?,
        attributes: Attributes?
    ) {
//        Log.d(TAG, "startElement() called with: uri = [$uri], localName = [$localName], qName = [$qName]")
        super.startElement(uri, localName, qName, attributes)

        if(localName.equals("li")){
            liClass=attributes?.getValue("class")
            if(liClass.equals("line")){
                listItem= RecyclerViewCell()
            }
        }
        if(localName.equals("img") && liClass.equals("line")){
            listItem?.imgSrc=attributes?.getValue("src")
        }
        if(localName.equals("p") && liClass.equals("line")){
            pClass=attributes?.getValue("class")
        }
    }

    override fun characters(ch: CharArray?, start: Int, length: Int) {
//        Log.d(TAG, "characters() called with: ch = [${String(ch!!)}], start = [$start], length = [$length]")
        super.characters(ch, start, length)
        if(pClass.equals("title")){
            ch?.let {
                val data =String(it,start,length)
                listItem?.itemTitle+=data
            }
        }
    }

    override fun endElement(uri: String?, localName: String?, qName: String?) {
//        Log.d(TAG, "endElement() called with: uri = [$uri], localName = [$localName], qName = [$qName]")
        super.endElement(uri, localName, qName)
        if(localName.equals("li")){
            liClass=""
            listItem?.let {
                htmlData?.itemList?.add(it)
            }
        }
        if(localName.equals("p")){
            pClass=""
        }
    }

    override fun endDocument() {
        Log.d(TAG, "endDocument() called")
        super.endDocument()
    }
}