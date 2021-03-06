/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.modeler.event;

import org.apache.cayenne.configuration.DataChannelDescriptor;
import org.apache.cayenne.map.DataMap;
import org.apache.cayenne.map.Embeddable;
import org.apache.cayenne.map.EmbeddableAttribute;

public class EmbeddableAttributeDisplayEvent extends EmbeddableDisplayEvent {

    protected EmbeddableAttribute[] embeddableAttributes;

    public EmbeddableAttributeDisplayEvent(Object src, Embeddable embeddable,
            EmbeddableAttribute attrs, DataMap dataMap, DataChannelDescriptor dataChannelDescriptor) {

        super(src, embeddable, dataMap, dataChannelDescriptor);
        embeddableAttributes = new EmbeddableAttribute[] {
            attrs
        };
    }

    public EmbeddableAttributeDisplayEvent(Object src, Embeddable embeddable,
            EmbeddableAttribute[] attr, DataMap dataMap, DataChannelDescriptor domain) {
        super(src, embeddable, dataMap, domain);
        this.embeddableAttributes = attr;
    }

    public EmbeddableAttributeDisplayEvent(Object src, Embeddable embeddable,
            EmbeddableAttribute[] attr) {
        super(src, embeddable, null, null);
        this.embeddableAttributes = attr;
    }

    public EmbeddableAttribute[] getEmbeddableAttributes() {
        return embeddableAttributes;
    }

}
