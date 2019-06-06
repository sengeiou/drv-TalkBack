/* Generated by Together */

package com.hp.hpl.sparta.xpath;

/**
 * A node test for an element with a particular tagname.
 * <p>
 * <blockquote><small> Copyright (C) 2002 Hewlett-Packard Company.
 * This file is part of Sparta, an XML Parser, DOM, and XPath library.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the <a href="doc-files/LGPL.txt">GNU
 * Lesser General Public License</a> as published by the Free Software
 * Foundation; either version 2.1 of the License, or (at your option)
 * any later version.  This library is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. </small></blockquote>
 *
 * @author Eamonn O'Brien-Strain
 * @version $Date: 2002/12/06 23:41:49 $  $Revision: 1.2 $
 */
public class AttrTest extends NodeTest {

    AttrTest(String attrName) {
        attrName_ = attrName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * Return true
     */
    public boolean isStringValue() {
        return true;
    }

    public String getAttrName() {
        return attrName_;
    }

    public String toString() {
        return "@" + attrName_;
    }

    private final String attrName_;
}

// $Log: AttrTest.java,v $
// Revision 1.2  2002/12/06 23:41:49  eobrain
// Add toString() which returns the original XPath.
//
// Revision 1.1.1.1  2002/08/19 05:04:05  eobrain
// import from HP Labs internal CVS
//
// Revision 1.3  2002/08/18 23:38:24  eob
// Add copyright and other formatting and commenting in preparation for
// release to SourceForge.
//
// Revision 1.2  2002/06/14 19:39:17  eob
// Make test for isStringValue more object-oriented.  Avoid "instanceof".
//
// Revision 1.1  2002/02/04 21:35:35  eob
// initial
