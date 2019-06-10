//
//  PTRExampleComments.h
//
//  Copyright © 2019 Pointr. All rights reserved.
//

/**
 * Keep basic text blocks within grouped lines of text to split things up. It's not *always* necessary but it
 * does help with rendering from source code. You can also experiment with HTML,
 * but it is not fully supported and it could break other things.
 *
 * ##### You can add some extra headers
 * but try to pair these with paragraphs so they render correctly
 *
 * @tip Also you should be aware that by adding headers you will affect the page navigation,
 * as headings and subheadings are used to create anchors and the contents sidebars displayed
 * on the left (in responsive mode) and right.
 *
 * If you need to describe a concept, it could be best done in the summary of that class with multiple
 * logical headings and sections
 *
 * ##### and headings will rank themselves based on level
 * So you can structure what you're explaining if necessary
 *
 * @danger but you should only use h5 or h6 as you will disrupt the page navigation
 * i.e., Don't do a level 4 heading or lower, which looks like this <pre>#### H4 heading<pre>
 */
@interface PTRExampleComments

/**
 * @property numberOfSteps
 *
 * @brief Lorem ipsum dolor sit amet, consectetur adipiscing elit,
 * sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
 * Ut enim ad minim veniam, quis nostrud exercitation
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit
 */
@property(readonly, nonatomic) NSNumber *numberOfSteps;

/**
 * You can add some admonition boxes to highlight information to the dev,
 * to highlight important things, discuss a usage, answer a question someone might have etc.
 *
 * to use one do this:
 *
 * <pre>&#64;warn Admonitions are a nice way to break up the page and highlight things</pre>
 *
 * but you should always try to get the admonition inside a a single paragraph as these can be
 * prone to rendering incorrectly
 *
 * @warn Admonitions are a nice way to break up the page and highlight things
 *
 * ##### You can go nuts but don't go too nuts
 *
 * there are lots to choose from as you'll see in the following, but do try not to overuse these
 * or they will clutter up the page
 *
 * @return Lorem ipsum dolor sit amet, consectetur adipiscing elit
 *
 */
- (float)admonitions:(CMQuaternion)quaternion;

/**
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @hint use Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @success use <code>@success</code>  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @return Lorem ipsum dolor sit amet, consectetur adipiscing elit
 */
- (double)admonitionsPositive:(double)angle;

/**
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @note use `@note` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @example use `@example` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @quote use `@quote` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @question use `@question` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @return Lorem ipsum dolor sit amet, consectetur adipiscing elit
 *
 */
- (void)admonitionsInfo;

/**
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @warn use `@warn` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @danger `@danger` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @bug use `@bug` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @fail `@fail` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
 *             eiusmod tempor incididunt ut labore et dolore magna aliqua.
 *             Ut enim ad minim veniam, quis nostrud exercitation!
 *
 */
- (double)admonitionsNegative: (double)admonition: (double)destAngle;

/**
 * Internal relative link [here](./CoreException.html)
 *
 * Internal relative link2 [here](./CoreException.html)
 *
 * external link [here](http://google.com)
 *
 * These look like this
 * <pre>
 *  Internal relative link {@literal [here](./PTRCoreConfiguration.h)}
 * </pre>
 *
 * `~~strike~~ two tildes`
 *
 * for striking things out Lorem ipsum dolor sit amet, consectetur adipiscing elit,
 * sed do eiusmod tempor ~~incididunt ut labore et dolore magna aliqua~~.
 * Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * `*italic* single asterisk`
 *
 * for italics Lorem ipsum dolor sit amet, consectetur adipiscing elit,
 * sed do eiusmod tempor *incididunt ut labore et dolore magna aliqua*.
 * Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * `**bold** two asterisks`
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit,
 * sed do eiusmod tempor **incididunt ut labore et dolore magna aliqua**.
 * Ut enim ad minim veniam, quis nostrud exercitation!
 *
 * @return Lorem ipsum dolor sit amet, consectetur adipiscing elit
 *
 * @warn these can break the page if not handled correctly
 */
+ (double)markdownInComments:(double)md;

/**
 * You can add chunks of code to your appledoc comments, these are a little unstable at time of writing
 * but they still add a lot to your code
 *
 * ##### how to use them?
 * you need to use `pre` tags as currently appledoc doesn't actually capture the indentation
 * it's totally fine for small snippets such as:
 * <pre>
 *     ___positionManager = manager
 * </pre>
 *
 * but if you add a <code>\t</code>
 * <pre>
 *   \t   ___positionManager = manager
 * </pre>
 *
 *
 * <pre>
 * \t if (self = [super init]) {
 * \t // C++ PositionManager
 * \t   ___positionManager = manager;
 * \t  _venueFacilityManager = venueFacilityManager;
 * \t  _configurationManager = configurationManager;
 * \t  _geofenceManager = geofenceManager;
 * \t  _wallManager = wallManager;
 * \t  _isStarted = NO;
 * \t } else {
 * \t\t if(adsasd){asdasd}
 * \t  }
 * }
 *</pre>
 *
 *
 * @param double code Lorem ipsum dolor sit amet, consectetur adipiscing elit
 * @param double code2 Lorem ipsum dolor sit amet, consectetur adipiscing elit
 *
 * @return double Lorem ipsum dolor sit amet, consectetur adipiscing elit
 */
+ (double)codeBlocksInComments:(double)code: (double)code2;

/**
 * Internal relative link [here](./PTRCoreConfiguration.html)
 *
 * Internal relative link [here](#bulletsandlists)
 *
 * Internal relative link2 [here](PointrBase.h)
 *
 * external link [here](http://google.com)
 *
 * @param links Lorem ipsum dolor sit amet, consectetur adipiscing elit
 * @param nav Lorem ipsum dolor sit amet, consectetur adipiscing elit
 */
+ (double)linksAndNav:(double)links:(double)nav;

/**
 * You can do markdown bullet pointed lists
 *
 * * First item.
 * * Second item with lot's of text
 *              spread across multiple lines.
 * * Third item.
 *  although there is only limited support available this right now
 *
 * @warn  
 * * First item.
 * * Second item with lot's of text
 *              spread across multiple lines.
 * * Third item.
 *  although there is only limited support available this right now
 *
 */
+ (void)bulletsAndLists:(float)value base:(float)base;

@end

/**
 * Callback given when an error in CB appears
 * It is due to Apple's bug failing updating CB state when a peripheral falsely disconnected
 * No programmatic solution for this issue only closing and opening BT fixes issue
 * [Please check: https://forums.developer.apple.com/thread/83852]
 */
public typedef NS_ENUM(NSUInteger, ExampleEnum) {
    ExampleEnum1,
    ExampleEnum2,
    ExampleEnum3,
    /// the3rditem
    ExampleEnum4,
    /// the 5th item
    ExampleEnum5,
    /** the sixth item*/
    ExampleEnum6
};

