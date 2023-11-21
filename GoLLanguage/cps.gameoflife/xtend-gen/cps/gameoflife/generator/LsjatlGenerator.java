/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.generator;

import cps.gameoflife.lsjatl.Condition;
import cps.gameoflife.lsjatl.Game;
import cps.gameoflife.lsjatl.Rule;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LsjatlGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final Game root = ((Game) _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("\t\t\t        \t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("\t\t\t       \t ");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("\t\t\t            ");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t\t                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      List<Rule> _rules = Auxiliary.getRules(root);
      for(final Rule rule : _rules) {
        CharSequence _rule2Text = LsjatlGenerator.rule2Text(rule);
        _builder_1.append(_rule2Text);
        _builder_1.newLineIfNotEmpty();
      }
    }
    String _plus = (_builder.toString() + _builder_1);
    fsa.generateFile("RulesOfLife.java", _plus);
  }

  protected static CharSequence _rule2Text(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ((");
    {
      String _state = rule.getState();
      boolean _tripleEquals = (_state == "dead");
      if (_tripleEquals) {
        _builder.append("!");
      }
    }
    _builder.append("gameBoard[i][j])");
    _builder.newLineIfNotEmpty();
    {
      List<Condition> _conditions = Auxiliary.getConditions(rule);
      for(final Condition condition : _conditions) {
        _builder.append("&& (surrounding ");
        String _boolOp = condition.getBoolOp();
        _builder.append(_boolOp);
        _builder.append(" ");
        int _nCount = condition.getNCount();
        _builder.append(_nCount);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public static CharSequence rule2Text(final Rule rule) {
    return _rule2Text(rule);
  }
}
