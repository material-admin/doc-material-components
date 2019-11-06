# Material Developer Users Article Stylesheet Checklist

This is a checklist for developer users articles reviews to ensure that the articles maintain stylistic and content standards.


- [ ]  Does the article use the Material.io component canonical name?

	<details>
		<summary>Description</summary>

	Use the canonical name (the name used in <a href="https://material.io/components/">material.io/components</a>\/\<component\>) instead of the API name for the platform. Reference the platform API name only when referencing the API.<br>

	For example Buttons: <br>
		 'Text button' is the canonical name, but <code>FlatButton</code> is the API name in Flutter. When describing the component or component variant in the text, use 'text button' and use `FlatButton` only in either the API references or code samples.


	</details>

- [ ]  Does the article use the same terminology as the component guidance (<a href="https://material.io/components/">material.io/components</a>/\<component\>)?

	<details>
		<summary>Description</summary>

	Aside from API variables and parameters, use the terminology from the component guidance pages.

	For example Chips: <br>
	The <a href="https://material.io/components/chips/#anatomy">Chips guidance</a> describes the use of 'Thumbnails' and 'Remove icon' images/icons. However, the <a href="https://material.io/develop/web/components/chips/#leading-and-trailing-icons">Web chips</a> article uses the terminology 'leading' and trailing' to describe the same images/icons.

	</details>

- [ ]  Does the article include all the Material.io component variants?<br>
	The article must include mention of all variants, including those not supported by the platform. Any variants not supported by the platform should be mentioned as 'unsupported', and mention any alternatives to Material.io.

	<details>
		<summary>Example using 'Buttons' component:
		</summary>

	[Material.io/buttons](https://material.io/components/buttons) has 4 different variants: <br>
	<ul>
		<li>Text</li>
		<li>Outlined</li>
		<li>Contained</li>
		<li>Toggle</li>
		<ul>
			<li> Toggle Bar</li>
			<li> Toggle Icon</li>
		</ul>
	</ul>
	</details>

- [ ]  Is the first word of the heading title capitalized? Are the remaining words in the title (aside from proper nouns or APIs) lower-case?
- [ ]  Do all instances of API names and API attribute names use <code>\`</code> or `\<code\>` tags?
- [ ]  Do all code samples use <code>\`\`\`\<language\></code>?

	<details>
		<summary>Example</summary>

	\`\`\`html
	\<head\> <br>
	&nbsp;&nbsp;&nbsp;&nbsp;  \<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"\><br>
	\</head\><br>
	\`\`\`
