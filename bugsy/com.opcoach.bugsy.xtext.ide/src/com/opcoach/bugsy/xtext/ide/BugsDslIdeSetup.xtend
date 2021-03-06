/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.ide

import com.google.inject.Guice
import com.opcoach.bugsy.xtext.BugsDslRuntimeModule
import com.opcoach.bugsy.xtext.BugsDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BugsDslIdeSetup extends BugsDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BugsDslRuntimeModule, new BugsDslIdeModule))
	}
	
}
