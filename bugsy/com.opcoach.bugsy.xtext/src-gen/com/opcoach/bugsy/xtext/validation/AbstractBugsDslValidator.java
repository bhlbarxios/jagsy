/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBugsDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage.eINSTANCE);
		return result;
	}
	
}
