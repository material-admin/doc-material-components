_Instructions to authors: replace text [in square brackets] with the appropriate items from your component and follow the instructions in each section. See the accompanying examples for futher guidance._

# \[Component\]

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

## Using \[Component\]

Include any usage instructions that are common to all variants.

If installation instructions are required, first summarize the requirement in 1-2 sentences and then give detailed instructions in a collapsable section.

If all variants use exactly the same list of API docs/source location links, or if there is a common set of links due to a superclass/etc, then include them here instead of repeating them in each variant section.

## \[Component Variant 1\]

Start with a concise (1-2 sentence) description of the component variant.

* If possible, copy the exact summary from the design article.

Include a list of links to at least API documentation and source location of the component.

* Use the class/implementation names when linking to the API docs.
* Add other links as necessary if they would help using the component.

Describe how to use this component variant in as much detail as necessary.

* If your platform does not support a particular variant, include the variant but explicitly state that it isn't supported.
* If support is planned, link to the issue tracking that feature request.

### Key properties

List the key properties/attributes/CSS classes of the component in a table.

* The first column is the property's name as used in the design article.
* The second column is the property's identifier in code.
* The third column is a short description of the property.
* If there are several related classes used together for the component, list their properties in separate tables.
* Only list the most important properties for configuring and theming the component—the full list of properties should be in the component's API docs.

### \[Component Variant 1\] example

Describe the example in 1-2 sentences.

Include an image of the rendered example.

Include a snippet of source code illustrating the example.

* Remove boilerplate code that is not necessary to understand the example.
* Consider highlighting the most important lines of the example.

The component example header should be one level below the component section header.

TODO(ajsecord): Are we including API attributes here?

## \[Component Variant 2\]
...
### \[Component Variant 2\] example
...
