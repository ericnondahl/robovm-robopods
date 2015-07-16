/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.bolts;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFURL/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFURLPtr extends Ptr<BFURL, BFURLPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFURL.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFURL() {}
    protected BFURL(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targetURL")
    public native NSURL getTargetURL();
    @Property(selector = "targetQueryParameters")
    public native NSDictionary<NSString, NSObject> getTargetQueryParameters();
    @Property(selector = "appLinkData")
    public native NSDictionary<NSString, NSObject> getAppLinkData();
    @Property(selector = "appLinkExtras")
    public native NSDictionary<NSString, NSObject> getAppLinkExtras();
    @Property(selector = "appLinkReferer")
    public native BFAppLink getAppLinkReferer();
    @Property(selector = "inputURL")
    public native NSURL getInputURL();
    @Property(selector = "inputQueryParameters")
    public native NSDictionary<NSString, NSObject> getInputQueryParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "URLWithURL:")
    public static native BFURL create(NSURL url);
    @Method(selector = "URLWithInboundURL:sourceApplication:")
    public static native BFURL create(NSURL url, String sourceApplication);
    /*</methods>*/
}