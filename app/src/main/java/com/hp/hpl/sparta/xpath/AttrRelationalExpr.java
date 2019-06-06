package com.hp.hpl.sparta.xpath;

/**
 * Compare attribute relative to integer.
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
 * @version $Date: 2002/10/30 16:16:52 $  $Revision: 1.1 $
 */
public abstract class AttrRelationalExpr extends AttrExpr {

    AttrRelationalExpr(String attrName, int attrValue) {
        super(attrName);
        attrValue_ = attrValue;
    }

    public double getAttrValue() {
        return attrValue_;
    }

    protected String toString(String op) {
        return "[" + super.toString() + op + "\'" + attrValue_ + "\']";
    }

    private final int attrValue_;

}

// $Log: AttrCompareExpr.java,v $
// Revision 1.1  2002/10/30 16:16:52  eobrain
// initial
//
