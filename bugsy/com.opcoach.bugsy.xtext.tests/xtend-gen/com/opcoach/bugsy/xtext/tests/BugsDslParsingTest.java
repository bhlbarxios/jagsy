/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.tests;

import com.google.inject.Inject;
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel;
import com.opcoach.bugsy.xtext.tests.BugsDslInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BugsDslInjectorProvider.class)
@SuppressWarnings("all")
public class BugsDslParsingTest {
  @Inject
  private ParseHelper<BugsModel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for ( ed in 1:N2 ) { }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("# Comment 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("tutu <- dbeta ()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("test ~ dbern(3,NZ,2.0E-4)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("NZ <- dgen.gamma() ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("titi ~ dbern(0, 3, 2)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("toto <- c( 0, 0.0 , 0.0E-4, tau) ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("test ~ c( test)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("afq <- dgen.gamma(afq)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("afq ~ acos(afq,afq,tutu)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("tutu <- dnorm(afq,tau)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("for ( a3 in 0:N3 ) { ");
      _builder.newLine();
      _builder.append("    \t  ");
      _builder.append("# Must loop on this...");
      _builder.newLine();
      _builder.append("    \t  ");
      _builder.append("test2 ~ dpois()");
      _builder.newLine();
      _builder.append("    \t  ");
      _builder.append("test33 <- dgamma(1.0, 1.6E-34)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
