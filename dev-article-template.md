_Instructions to authors: replace text [in square brackets] with the appropriate items from your component and follow the instructions in each section. See the accompanying examples for futher guidance._

# \[Component name\]

Start with a concise (1-2 sentence) description of the component.

* If possible, copy the exact summary from the design article.
* Do not use the name of the component's class or implementation.
* Link the first mention of the component (e.g., "Button") to the design article.
* If the component is known by an alias on your platform, include that in the description, e.g. "... Ripples are known as 'Ink' in MDC-iOS."

If there are any component variants, list them here in an unordered bulleted list.

* Use the same ordering as in the design article.
* Link each item in the list to the corresponding variant section below. (If a section is called "Foo The Bar", then the anchor to link to is `#foo-the-bar`.)

Insert an image showing the component or all the component variants.

* If no such image exists, file a bug and add a TODO with the bug in an HTML comment in the source.

## Using \[Component name\]

If there are any instructions on using the component that applies to all component variants (for example, installation or theming, accessiblity), include them here.

* Use an ordered list for ordered steps (`1.`)
* Use an unorered list for steps that have no particular order (`* `)

If there is a separate page that has instructions, link to that page.
<!-- What are the best ways to integrate component accessbility features into the template? -->

## \[Component variant\]
Divide the component into its variants, preferably as described in the [material.io/components] pages.


For example, [chips](https://material.io/components/chips/) is divided into the following 2nd tier (`##` header) sections based on its variants:

* Input chip
* Choice chip
* Filter chip
* Action chip

Each section should have a 2nd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component.

**Important** If your platform does not support a particular variant, include the variant but EXPLICITLY STATE THAT IT ISN'T SUPPORTED. Consider including a link to a library that does support the variant.


### \[Component variant\] example

The variant example header should be one level below the component variant header.

The example section should have the following:
* 1-2 sentences to describe the example
* An image rendering whatever sample code is included
* A list of links to the applicable API(s) listed from highest level to lowest level: include both developer source (e.g., [developer.android.com], or as available) and GitHub source
* Provide example source code that can generate the example in the image. Mention any themes/settings used
