package controllers

import it.uniroma1.lcl.babelnet._;
import it.uniroma1.lcl.babelnet.iterators._;
import it.uniroma1.lcl.jlt.util.Language;
import it.uniroma1.lcl.jlt.util.ScoredItem;

import com.google.common.collect.Multimap;

import edu.mit.jwi.item.IPointer;
import edu.mit.jwi.item.POS;

import play.api._
import play.api.mvc._

object Application extends Controller {

  var bn = BabelNet.getInstance();

  def index = Action {
    val translations = bn.getTranslations(Language.EN, "word").get(Language.JA);
    Ok(views.html.index("Your new application is ready." + translations))
    //  Ok(views.html.index("Your new application is ready."))
  }

  def jtoe(word: String) = Action {
    val translations = bn.getTranslations(Language.JA, word).get(Language.EN)
    Ok(views.html.jtoe(translations.toString()))
  }

  def etoj(word: String) = Action {
    val translations = bn.getTranslations(Language.EN, word).get(Language.JA)
    Ok(views.html.jtoe(translations.toString()))
  }
}

