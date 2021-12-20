/*******************************************************************************
 * Copyright 2016, 2018 vanilladb.org contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.vanilladb.bench.remote.sp;

import java.sql.SQLException;

import org.vanilladb.bench.BenchmarkerParameters;
import org.vanilladb.bench.remote.SutConnection;
import org.vanilladb.bench.remote.SutDriver;
import org.vanilladb.calvin.communication.client.GroupCommDriver;
import org.vanilladb.core.remote.storedprocedure.SpDriver;

public class VanillaDbSpDriver implements SutDriver {
	
	@Override
	public SutConnection connectToSut() throws SQLException {
		//SpDriver driver = new SpDriver();
		GroupCommDriver driver = new GroupCommDriver();

		//return new VanillaDbSpConnection(driver.connect(BenchmarkerParameters.SERVER_IP, null));
		return new VanillaDbSpConnection(driver.connect(0));

	}
}
