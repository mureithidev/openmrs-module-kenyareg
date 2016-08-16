/**
 * The contents of this file are subject to the OpenMRS Public License Version 1.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at http://license.openmrs.org
 * <p/>
 * Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either
 * express or implied. See the License for the specific language governing rights and limitations under the License.
 * <p/>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.kenyareg.api;

import ke.go.moh.oec.Person;
import org.go2itech.oecui.data.RequestResultPair;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;

public interface RegistryService extends OpenmrsService {

    RequestResultPair findPerson(int server, Person person);

    Patient acceptPerson(Person person, Person fromLpi, Person fromMpi);
}
