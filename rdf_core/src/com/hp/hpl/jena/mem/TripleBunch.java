/*
    (c) Copyright 2005, 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
    All rights reserved - see end of file.
    $Id: TripleBunch.java,v 1.11 2009/01/27 15:32:17 chris-dollin Exp $
*/
package com.hp.hpl.jena.mem;

import com.hp.hpl.jena.graph.Triple;
//import com.hp.hpl.jena.graph.query.Domain;
//import com.hp.hpl.jena.graph.query.StageElement;

import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
    A bunch of triples - a strippled-down set with specialised methods. A
    bunch is expected tos tore triples that share some useful property 
    (such as having the same subject or predicate).
    
    @author kers
*/
public interface TripleBunch 
    {
    public abstract boolean contains( Triple t );
    
    public abstract boolean containsBySameValueAs( Triple t );
    
    public abstract int size();
    
    public abstract void add( Triple t );
    
    public abstract void remove( Triple t );
    
    public abstract ExtendedIterator<Triple> iterator();
    
    public abstract ExtendedIterator<Triple> iterator( HashCommon.NotifyEmpty container );
    
//    public abstract void app( Domain d, StageElement next, MatchOrBind s );
    }
/*
 * (c) Copyright 2005, 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/