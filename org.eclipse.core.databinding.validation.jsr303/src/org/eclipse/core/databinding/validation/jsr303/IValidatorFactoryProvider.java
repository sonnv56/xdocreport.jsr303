/*******************************************************************************
 * Copyright (c) 2011 Angelo Zerr and Pascal Leclercq.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:      
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *     Pascal Leclercq <pascal.leclercq@gmail.com> - Initial API and implementation 
 *******************************************************************************/
package org.eclipse.core.databinding.validation.jsr303;

import javax.validation.ValidatorFactory;

/**
 * JSR-303 {@link ValidatorFactory} provider.
 * 
 */
public interface IValidatorFactoryProvider {

	/**
	 * Returns the JSR-303 {@link ValidatorFactory} instance to use to validate.
	 * 
	 * @return
	 */
	ValidatorFactory getValidatorFactory();

}
