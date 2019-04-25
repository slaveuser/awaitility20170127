/*
 * Copyright 2010 the original author or authors.
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
package org.awaitility.proxy;

/**
 * The Class CannotCreateProxyException.
 */
public class CannotCreateProxyException extends RuntimeException {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2443849094145412513L;

	/**
	 * Instantiates a new cannot create proxy exception.
	 *
	 * @param message the message
	 */
	public CannotCreateProxyException(String message) {
		super(message);
	}

}
