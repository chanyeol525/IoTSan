package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AStrongArrayNavigation extends PNavigation
{
	private TLBracket _lBracket_;
	private PExp _exp_;
	private TRBracket _rBracket_;

	public AStrongArrayNavigation()
	{
	}
	public AStrongArrayNavigation(
		TLBracket _lBracket_,
		PExp _exp_,
		TRBracket _rBracket_)
	{
		setLBracket(_lBracket_);

		setExp(_exp_);

		setRBracket(_rBracket_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAStrongArrayNavigation(this);
	}
	public Object clone()
	{
		return new AStrongArrayNavigation(
			(TLBracket) cloneNode(_lBracket_),
			(PExp) cloneNode(_exp_),
			(TRBracket) cloneNode(_rBracket_));
	}
	public PExp getExp()
	{
		return _exp_;
	}
	public TLBracket getLBracket()
	{
		return _lBracket_;
	}
	public TRBracket getRBracket()
	{
		return _rBracket_;
	}
	void removeChild(Node child)
	{
		if(_lBracket_ == child)
		{
			_lBracket_ = null;
			return;
		}

		if(_exp_ == child)
		{
			_exp_ = null;
			return;
		}

		if(_rBracket_ == child)
		{
			_rBracket_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_lBracket_ == oldChild)
		{
			setLBracket((TLBracket) newChild);
			return;
		}

		if(_exp_ == oldChild)
		{
			setExp((PExp) newChild);
			return;
		}

		if(_rBracket_ == oldChild)
		{
			setRBracket((TRBracket) newChild);
			return;
		}

	}
	public void setExp(PExp node)
	{
		if(_exp_ != null)
		{
			_exp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_exp_ = node;
	}
	public void setLBracket(TLBracket node)
	{
		if(_lBracket_ != null)
		{
			_lBracket_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_lBracket_ = node;
	}
	public void setRBracket(TRBracket node)
	{
		if(_rBracket_ != null)
		{
			_rBracket_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rBracket_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_lBracket_)
			+ toString(_exp_)
			+ toString(_rBracket_);
	}
}
