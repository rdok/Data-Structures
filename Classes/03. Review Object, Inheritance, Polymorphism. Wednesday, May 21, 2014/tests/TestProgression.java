/*******************************************************************************
 * Copyright 2014 Rizart Dokollari
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
import junit.framework.TestCase;
import me.rdokollari.UML.convert.Progression;

/*******************************************************************************
 * Copyright 2014 Rizart Dokollari
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 21, 2014
 */
public class TestProgression extends TestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for
	 * {@link me.rdokollari.UML.convert.Progression#printProgression(int)}.
	 */
	public void testPrintProgression() {
		Progression progression = new Progression();
		assertEquals(0, progression.firstValue());
	}

	/**
	 * Test method for
	 * {@link me.rdokollari.UML.convert.Progression#firstValue(int))}.
	 */
	public void testFirstValue() {
		Progression progression = new Progression();
		assertEquals(0, progression.firstValue());
	}

}
