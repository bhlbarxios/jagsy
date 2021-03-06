/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.tests

import com.google.inject.Inject
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BugsDslInjectorProvider)
class BugsDslParsingTest {
	@Inject
	ParseHelper<BugsModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			model { 
				for ( ed in 1:N2 ) { }
			
			# Comment 1
				tutu <- dbeta ()
				test ~ dbern(3,NZ,2.0E-4)
				NZ <- dgen.gamma() 
				titi ~ dbern(0, 3, 2)
			    toto <- c( 0, 0.0 , 0.0E-4, tau) 
			    test ~ c( test)
			    afq <- dgen.gamma(afq)
			    afq ~ acos(afq,afq,tutu)
			    tutu <- dnorm(afq,tau)
			    for ( a3 in 0:N3 ) { 
			    	  # Must loop on this...
			    	  test2 ~ dpois()
			    	  test33 <- dgamma(1.0, 1.6E-34)
			    }
			    }
			    
			    
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
