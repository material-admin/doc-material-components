_**Instructions to authors: **_
* Copy this template into your repo
* Replace text \<in angle brackets\> with the appropriate items from your component
* Follow the instructions in each sectio &ndash; see the accompanying examples for futher guidance: [button-examples](button-examples)

<!--  20191125 Todo:
* tables for attributes for each type
* (phase II) include anatomy section referencing the material.io/components
    * table referencing anatomy mapping to attributes (test this out per platform for naming that is consistent for all variants)
    * try to include a single image from design that diagrams attributes
-->

# \<Component name\>

Start with a concise (1-2 sentence) description of the component.

* Copy the exact summary from the design article.
* Do not use the name of the component's class or implementation.
* Link the first mention of the component (e.g., "Button") to the design article.
* If the component is known by an alias on your platform, include that in the description, e.g. "... Ripples are known as 'Ink' in MDC-iOS."

If there are any component types, list them here in an unordered bulleted list.

* Use the same ordering as in the design article.
* Link each item in the list to the corresponding type section below. (If a section is called "Foo The Bar", then the anchor to link to is `#foo-the-bar`.)

Insert an image showing the component or all the component types.

* If no such image exists, file a bug and add a TODO with the bug in an HTML comment in the source.


## Using \<Component name\>

If there is a link to a 'Getting started' page for your platform, add the link here.

If there are any instructions on using the component that applies to all component types (for example, installation or theming, accessiblity), include them here.

* Use an ordered list for ordered steps (`1.`)
* Use an unorered list for steps that have no particular order (`* `)

<!-- What are the best ways to integrate component accessbility features into the template? -->

## \<Component type\>

Divide the component into its types, preferably as described in the [material.io/components] pages.


For example, [chips](https://material.io/components/chips/) is divided into the following 2nd tier (`##` header) sections based on its types:

* Input chip
* Choice chip
* Filter chip
* Action chip

* Each section should have a 2nd tier header
* Add 1-2 sentences from the material.io website that describes when and how to use the component
* Add a link in the first mention of the type to the material.io/component page
* Add any information that conflicts with the guidance descriptions
* Preface any important notes using **NOTE:**

**Important** If your platform does not support a particular type, include the type but EXPLICITLY STATE THAT IT ISN'T SUPPORTED. Consider including a link to a library that does support the type.


### \<Component type\> example

The type example header should be one level below the component type header.

The example section should have the following:
* 1-2 sentences to describe the example
* An image rendering whatever sample code is included
* A list of links to the applicable API(s) listed from highest level to lowest level: include both developer source (e.g., [developer.android.com], or as available) and GitHub source
* Provide example source code that can generate the example in the image. Mention any themes/settings used
