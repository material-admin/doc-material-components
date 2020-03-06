# Usage Document Checklist

This is a checklist for developers to ensure that their usage documents maintain stylistic and content standards.


- [ ]  Your documentation's tone, language, grammar, and images follow the [Google developer documentation style guide highlights](https://developers.google.com/style/highlights).
- [ ]  Your document uses the language platform-specific language ("dependencies" vs "installs" for instance)
- [ ]  Your document is free of all text related to document instructions, such as `\<your platform\>` or `\<insert your code here\>`
- [ ]  Your document has metadata in the top comment of the file that contains the appropriate information for your platform's component
- [ ]  Your document uses the  &ndash; ('\&ndash;') and not &mdash; ('\&mdash;')
- [ ]  All components (all elements, images, videos, icons, any other critical graphical element) are labelled correctly for screen reader use (see the [greenlines for elements](https://sites.google.com/corp/google.com/greenlinesv2/how-to-greenline/greenlines-for-elements) for more details on what to include in your labels)
- [ ]  Your document's images of text have correct screen readable labels
- [ ]  Your document's hyperlinks communicate their destinations in text 
- [ ]  Your document uses Nomenclature is consistent throughout the application (and Google) (e.g. “Delete” and “Erase” should not both exist.)
- [ ]  Your documentation uses the canonical component name from the guidelines.

	<details>
		<summary>Description</summary>

	Use the name used in <a href="https://material.io/components/">material.io/components</a>\/\<component\> instead of the API name for the platform. Reference the platform API name only when referencing the API.<br>

	For example, buttons: <br>
		 'Text button' is the canonical name, but <code>FlatButton</code> is the API name in Flutter. When describing the component or component type in the text, use 'text button' and use `FlatButton` only in either the API references or code samples.


	</details>

- [ ]  Your documentation uses the same component terminology as the guidelines.

	<details>
		<summary>Description</summary>

	Aside from API variables and parameters, use the terminology from the component guidance pages.


	For example, chips: <br>
	The <a href="https://material.io/components/chips/#anatomy">chips guidance</a> describes the use of 'thumbnails' and 'remove icon' images/icons. However, the <a href="https://material.io/develop/web/components/chips/#leading-and-trailing-icons">chips article for the web</a> uses the terminology 'leading' and 'trailing' to describe the same images/icons. 
	
	Because this documentation is focused on examples resembling those found in the guidance for material.io/components, use the terminology in the guidance.

	</details>

- [ ]  Your document includes all the component types listed in the guidelines.<br>
	You must include all types, including those not supported by the platform. Any types not supported by the platform should be mentioned as 'unsupported'.

	<details>
		<summary>Example</summary>

	The [buttons component](https://material.io/components/buttons) has 4 types: <br>
	<ul>
		<li>Text button</li>
		<li>Outlined button</li>
		<li>Contained button</li>
		<li>Toggle button</li>
	</ul>
	</details>

- [ ]  The first word of all heading titles are capitalized and the remaining words in the title (aside from proper nouns or APIs) are lower-case.
- [ ]  All instances of API names and API attribute names use <code>\`</code> or `\<code\>` tags.
- [ ]  All code samples use <code>\`\`\`\<language\></code>.

	<details>
		<summary>Example</summary>

	\`\`\`html <br>
	\<head\> <br>
	&nbsp;&nbsp;&nbsp;&nbsp;  \<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"\><br>
	\</head\><br>
	\`\`\`
	</details>
