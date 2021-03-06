/*******************************************************************************
 *  Copyright 2007, 2009 Jorge Villalon (jorge.villalon@uai.cl)
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at 
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0 
 *  	
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License.
 *******************************************************************************/
package tml.vectorspace.operations.results;

public class ParagraphCoherenceIndexResult extends AbstractResult {

	String paragraphId;
	double index;
	/**
	 * @return the paragraphId
	 */
	public String getParagraphId() {
		return paragraphId;
	}
	/**
	 * @param paragraphId the paragraphId to set
	 */
	public void setParagraphId(String paragraphId) {
		this.paragraphId = paragraphId;
	}
	/**
	 * @return the index
	 */
	public double getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(double index) {
		this.index = index;
	}
	
}
