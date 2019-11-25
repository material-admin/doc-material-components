_Instructions to authors: replace text \<in angle brackets\> with the appropriate items from your component and follow the instructions in each section. See the accompanying examples for futher guidance._

<!--  20191125 Todo:
* replace square brackets for fill-in content with angle brackets
* Using <component> should start with link to a platform-specific "Getting started" page
* tables for attributes for each type
* (phase II) include anatomy section referencing the material.io/components
    * table referencing anatomy mapping to attributes (test this out per platform for naming that is consistent for all variants)
    * try to include a single image from design that diagrams attributes
* "types" vs "variants" -- use "types" instead of "variants"
* make sure to link first mention of component type in each type sections in m.io/components
* "Using <component>" should use the platform-specific language ("dependencies" vs "installs" for instance)
* component types: make sure to include information that might be specific to the platform when it conflices with guidance
* Adding notes: **NOTE:**
* Add in the style guide that we use &ndash; and not &mdash;
* 
-->

# \<Component name\>

Start with a concise (1-2 sentence) description of the component.

* Copy the exact summary from the design article.
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
