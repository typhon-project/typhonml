/**
 * generated by Xtext 2.15.0
 */
package it.univaq.disim.typhon.formatting2;

import com.google.inject.Inject;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import typhonml.CustomDataType;
import typhonml.Model;

@SuppressWarnings("all")
public class TyphonMLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private TyphonMLGrammarAccess _typhonMLGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<CustomDataType> _customDataTypes = model.getCustomDataTypes();
    for (final CustomDataType dataType : _customDataTypes) {
      document.<CustomDataType>format(dataType);
    }
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
