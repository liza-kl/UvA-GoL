/*
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractLsjatlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(cps.gameoflife.lsjatl.LsjatlPackage.eINSTANCE);
		return result;
	}
}
