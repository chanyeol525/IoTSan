package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.analysis.*;

public final class TAssertions extends Token
{
	public TAssertions()
	{
		super.setText("assertions");
	}
	public TAssertions(int line, int pos)
	{
		super.setText("assertions");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTAssertions(this);
	}
	public Object clone()
	{
	  return new TAssertions(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TAssertions text.");
	}
}
