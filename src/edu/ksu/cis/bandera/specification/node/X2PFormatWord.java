package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.analysis.*;

public final class X2PFormatWord extends XPFormatWord
{
	private PFormatWord _pFormatWord_;

	public X2PFormatWord()
	{
	}
	public X2PFormatWord(
		PFormatWord _pFormatWord_)
	{
		setPFormatWord(_pFormatWord_);
	}
	public void apply(Switch sw)
	{
		throw new RuntimeException("Switch not supported.");
	}
	public Object clone()
	{
		throw new RuntimeException("Unsupported Operation");
	}
	public PFormatWord getPFormatWord()
	{
		return _pFormatWord_;
	}
	void removeChild(Node child)
	{
		if(_pFormatWord_ == child)
		{
			_pFormatWord_ = null;
		}
	}
	void replaceChild(Node oldChild, Node newChild)
	{
	}
	public void setPFormatWord(PFormatWord node)
	{
		if(_pFormatWord_ != null)
		{
			_pFormatWord_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_pFormatWord_ = node;
	}
	public String toString()
	{
		return "" +
			toString(_pFormatWord_);
	}
}
