/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cps.gameoflife.LsjatlRuntimeModule;
import cps.gameoflife.LsjatlStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LsjatlIdeSetup extends LsjatlStandaloneSetup {
  @Override
  public Injector createInjector() {
    LsjatlRuntimeModule _lsjatlRuntimeModule = new LsjatlRuntimeModule();
    LsjatlIdeModule _lsjatlIdeModule = new LsjatlIdeModule();
    return Guice.createInjector(Modules2.mixin(_lsjatlRuntimeModule, _lsjatlIdeModule));
  }
}
