package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TStrongMod extends Token
{
	public TStrongMod()
	{
		super.setText("%");
	}
	public TStrongMod(int line, int pos)
	{
		super.setText("%");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTStrongMod(this);
	}
	public Object clone()
	{
	  return new TStrongMod(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TStrongMod text.");
	}
}
