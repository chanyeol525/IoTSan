/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AExpr5Expr6 extends PExpr6
{
    private PExpr5 _expr5_;

    public AExpr5Expr6()
    {
    }

    public AExpr5Expr6(
        PExpr5 _expr5_)
    {
        setExpr5(_expr5_);

    }
    public Object clone()
    {
        return new AExpr5Expr6(
            (PExpr5) cloneNode(_expr5_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpr5Expr6(this);
    }

    public PExpr5 getExpr5()
    {
        return _expr5_;
    }

    public void setExpr5(PExpr5 node)
    {
        if(_expr5_ != null)
        {
            _expr5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr5_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr5_);
    }

    void removeChild(Node child)
    {
        if(_expr5_ == child)
        {
            _expr5_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr5_ == oldChild)
        {
            setExpr5((PExpr5) newChild);
            return;
        }

    }
}
