/*
 * Copyright (c) 2011 - 2016, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.t2;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.apiomat.nativemodule.*;

import com.apiomat.nativemodule.t1.T1Class;

import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.t1.*;
import com.apiomat.nativemodule.AuthState;
/**
* Generated class for your T2Class data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@SuppressWarnings( "unused" )
@Model( moduleName = "T2",
    hooksClassNameTransient = "com.apiomat.nativemodule.t2.T2ClassHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.t2.T2ClassHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=UserRole.User, requiredUserRoleRead=UserRole.User,
    requiredUserRoleWrite=UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class T2Class extends T1Class
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "T2";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "T2Class";

    /** class specific attributes */
    private com.apiomat.nativemodule.t1.T1Class t1attr = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public T2Class ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public com.apiomat.nativemodule.t1.T1Class getT1attr()
    { 
        if(this.t1attr == null)
        {
            /* do this by reflection to be backward compartible */
            try
            {
                Method m = AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.t1attr =  ( com.apiomat.nativemodule.t1.T1Class ) m.invoke( this, "t1attr", com.apiomat.nativemodule.t1.T1Class.class );
            }
            catch ( NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.t1attr;
    }

    public void postT1attr( final com.apiomat.nativemodule.t1.T1Class refData )
    {
        addReference( "t1attr", refData );
        this.t1attr = refData;
    }

    public void removeT1attr( final com.apiomat.nativemodule.t1.T1Class refData )
    {
        removeReference( "t1attr", refData );
        this.t1attr = null;
    }

}
