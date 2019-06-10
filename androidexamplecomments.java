package com.pointrlabs.core.configuration;

import android.widget.Filter;
import android.widget.Filterable;

import java.io.File;

/**
 * <p>
 * Keep basic text blocks within html p tags to split things up. It's not *always* necessary but it
 * does help with rendering from javadoc.
 * You can experiment with HTML, but it is not always a good thing to do.
 * </p>
 *
 * ##### You can add some extra headers
 * <p>
 *  but try to pair these with paragraphs so they render correctly
 * </p>
 *
 * <p> $tip
 * Also you should be aware that by adding headers you will affect the page navigation,
 * as headings and subheadings are used to create anchors and the contents sidebars displayed
 * on the left (in responsive mode) and right.
 * <p>
 *
 *</p>
 * For this reason, you should restrict these to the top definition of the class. Javadoc parses
 * according to items attached to elements of code and definitions, it doesn't just take hanging text.
 *</p>
 *
 *<p>
 * If you need to describe a concept, it could be best done in the summary of that class with multiple
 * logical headings and sections
 *</p>
 *
 * ##### and headings will rank themselves based on level
 *<p>
 * So you can structure what you're explaining if necessary
 *</p>
 *
 * <p>@danger but you should only use h5 or h6 as you will disrupt the page navigation
 * i.e., Don't do a level 4 heading or lower (i.e., `#### H4 heading`) </p>
 *
 */
@SuppressWarnings("ClassExplicitlyExtendsObject")
public class Example extends Object implements Filterable {
	
	/**
	 * Example class constructor definition
	 *
	 * <p>
	 * Constructors will be moved to the top of the page regardless of where they're declared
	 * but that doesn't mean you should just put them anywhere
	 * </p>
	 *
	 * <p>
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
	 * labore et dolore magna aliqua. Ut enim ad minim veniam!
	 * </p>
	 *
	 */
	public Example(){
		super();
	}
	
	/**
	 *
	 * @return some text
	 */
	public Object blocksOfText() {
		return null;
	}
	
	/**
	 * <p>if you just want to show a word or something as preformatted: use backticks
	 * (i.e.,some preformAttedThing term`) will resolve to `some preformAttedThing term`.
	 * </p><p>
	 * Since we render to markdown and then html, special characters such as `@`, `<` and `>`
	 * have to be escaped with HTML codes, typically, if you need to use them within pre formatted text.
	 * </p><p>
	 * so you should use `pre`, this will also perform java code highlighting
	 * <pre>but if you need some seriously preformatted
	 *           text then you will need to use the correct &#60pre&#62 &#60/pre&#62 tags </pre>
	 * </p><p>
	 * these will currently be combined if you don't include a line of text in between
	 * </p><p>
	 * You don't need to do anything to preserve the indentation inside `pre` tags:
	 * </p>
	 * <pre>
	 *       public AppCompatDelegate getDelegate() {
	 *         if (mDelegate == null) {
	 *             mDelegate = AppCompatDelegate.create(this, this);
	 *         }
	 *         return mDelegate;
	 *     }
	 * </pre>
	 *
	 * @param param1
	 *          Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 * @param param2
	 *          Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 * @return the new entry
	 *
	 */
	public Object codeSamples(File param1, Object param2) {
		return oldEntry;
	}
	
	/**
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * Ut enim ad minim veniam, quis nostrud exercitation!
	 *
	 * @param param1
	 *          Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 * @param param2
	 *          Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 * @return the new entry
	 *
	 */
	public Object replaceFile(Object param1, Object param2){
		return param1;
	}
	
	
	/**
	 * <p>$example MainEntries - An example property of type {@link Object} lorem ipsum dolor sit amet,
	 * consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
	 * magna aliqua.Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p>
	 */
	public Object[] mainEntries1;
	
	/**
	 * <p>An example property of type {@link Object} lorem ipsum dolor sit amet,
	 * consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
	 * magna aliqua.Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p>
	 */
	public Object[] mainEntries2;
	
	
	/**
	 * <p>
	 * You can add some admonition boxes to highlight information to the dev,
	 * to highlight important things, discuss a usage, answer a question someone might have etc.
	 * To use one of these do this:
	 * </p>
	 *
	 * <p>
	 * but you should always try to get the admonition inside a a single paragraph as these can be
	 * prone to rendering incorrectly
	 * </p>
	 *
	 * <p>$warn Admonitions are a nice way to break up the page and highlight things</p>
	 *
	 * ##### You can go nuts but don't go too nuts
	 *
	 * <p>
	 * there are lots to choose from as you'll see in the following, but do try not to overuse these
	 * or they will clutter up the page
	 * </p>
	 *
	 * @return {@link Object[]} Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 *
	 */
	public Object[] admonitions(){
		return mainEntries;
	}
	
	
	/**
	 *
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 *
	 * <p>$note use `note` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$example use `$example`  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$quote use `$quote` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$question use `$question` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * @return {@link Object[]} Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 *
	 */
	public Object[] admonitionsInfo(){
		return mainEntries;
	}
	
	/**
	 *
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 *
	 * <p>$hint use `$hint` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$success use `$success`  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * @return {@link Object[]} Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 */
	public Object[] admonitionsPositives(){
		return mainEntries;
	}
	
	/**
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 *
	 * <p>$warn use `$warn` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	 eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$danger use `$danger` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * 	 </p>
	 *
	 * <p>$bug use `$bug` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p>
	 *
	 * <p>$fail use `$fail` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
	 * 	  	  eiusmod tempor incididunt ut labore et dolore magna aliqua.
	 * 	  	  Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p>
	 *
	 * @return {@link Object[]} Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 */
	public Object[] admonitionsWarnings(){
		return mainEntries;
	}
	
	/**
	 * <p>
	 * Internal relative link [here](./CoreException.html)
	 * </p>
	 * <p>
	 * Internal relative link2 [here](./CoreException.html)
	 * </p>
	 * <p>
	 * external link [here](http://google.com)
	 * <p/>
	 *
	 * These look like this
	 * <pre>
	 *  Internal relative link {@literal [here](./CoreException.html)}
	 * </pre>
	 * `~~strike~~ two tildes`
	 * <p>
	 * for striking things out Lorem ipsum dolor sit amet, consectetur adipiscing elit,
	 * sed do eiusmod tempor ~~incididunt ut labore et dolore magna aliqua~~.
	 * Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p><p>
	 * `*italic* single asterisk`
	 * </p><p>
	 * for italics Lorem ipsum dolor sit amet, consectetur adipiscing elit,
	 * 	 sed do eiusmod tempor *incididunt ut labore et dolore magna aliqua*.
	 * 	 Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p><p>
	 * `**bold** two asterisks`
	 * </p><p>
	 * for making things bold Lorem ipsum dolor sit amet, consectetur adipiscing elit,
	 * 	sed do eiusmod tempor **incididunt ut labore et dolore magna aliqua**.
	 * 	Ut enim ad minim veniam, quis nostrud exercitation!
	 * </p>
	 *
	 * @return {@link Object[]} Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 *
	 * <p>@warn these can break the page if not handled correctly</p>
	 *
	 */
	
	public static Object[] markdownInAComment(){
		return new String[0];
	}


    /**
     * <p>
     * For a standard bullet use a `$b` (on a new line), we can't rely on preserving text indentation so markdown bullets aren't great coming from javadoc.
     * when starting a bullet list after a block of text, you should use a `$n` $n
     * $b bullet one $
     * $b bullet two $
     * $b bullet three $
     * </p>
     *
     *<p>
     * $note sometimes (especially when we're inside an admonition) we need a little bit of formatting help, so use `$bt` and `$n` $n
     *   $bt Dashed line path mode: The paths drawn will be drawn as dashed lines. $
     *   $bt Dotted line path mode: The paths drawn will be drawn as dotted lines. $
     *   $bt Line path mode: The paths drawn will be drawn as single continuous line. $
     *</p>
     *
     * $note Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
     * labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation!
     *
     */
	public static Object[] formattingBulletsAndInmonitionBullets(){
		return new String[0];
	}
	
	/**
	 * <p>
	 * for some assistance in getting new lines and tabs you can use `$n` and `$t`
	 * </p>
	 * <p>
	 * 	$note these must have a space both before and after $n $t so they aren't picked up accidentally
	 * </p>
	 *
	 * @return {@link Object[]} array of objects
	 */
	public static Object[] formattingExtraThings(){
		return new String[0];
	}

	/**
	 * <p>
	 * Example implemented function
	 * Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 * </p>
	 *
	 * @return {@link Filter} the Lorem ipsum dolor sit amet, consectetur adipiscing elit
	 */
	@Override
	public Filter getFilter(){
		return null;
	}
	
	/**
	 * <p>$note The integer values of the enumerations are in a inverse relation.</p>
	 */
	public enum ExampleEnum {
		HIGHEST_PRIORITY,
		/**
		 * Highest priority for a network package with an integer value of 5.
		 */
		HIGH_PRIORITY,
		/**
		 * Middle priority for a network package with an integer value of 11.
		 */
		NORMAL_PRIORITY,
		/**
		 * Lowest priority for a network pacakge with an integer value of 12.
		 */
		LOW_PRIORITY;
	}
}
