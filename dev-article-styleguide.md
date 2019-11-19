# Material Developer Usage Document Checklist

This is a checklist for developers to ensure that their usage documents maintain stylistic and content standards.


- [ ]  Use the Google developer documentation [style guide highlights page](https://developers.google.com/style/highlights) as a checklist. 

	For a more detailed description of the Google style guidelines, go to the [Google developer documentation style guide](https://developers.google.com/style/).
- [ ]  The article meets [accessibility guidelines](https://sites.google.com/corp/google.com/greenlinesv2/how-to-greenline/greenlines-for-elements#h.p_56wIA8ABpc2P) for image alt text.
- [ ]  Documentation uses the canonical component name from the guidelines.

	<details>
		<summary>Description</summary>

	Use the canonical name (the name used in <a href="https://material.io/components/">material.io/components</a>\/\<component\>) instead of the API name for the platform. Reference the platform API name only when referencing the API.<br>

	For example, buttons: <br>
		 'Text button' is the canonical name, but <code>FlatButton</code> is the API name in Flutter. When describing the component or component variant in the text, use 'text button' and use `FlatButton` only in either the API references or code samples.


	</details>

- [ ]  Documentation uses the same component terminology as the guidelines.

	<details>
		<summary>Description</summary>

	Aside from API variables and parameters, use the terminology from the component guidance pages.


	For example, chips: <br>
	The <a href="https://material.io/components/chips/#anatomy">Chips guidance</a> describes the use of 'thumbnails' and 'remove icon' images/icons. However, the <a href="https://material.io/develop/web/components/chips/#leading-and-trailing-icons">Web chips</a> article uses the terminology 'leading' and 'trailing' to describe the same images/icons. 
	
	Because this documentation is focused on examples resembling those found in the guidance for material.io/components, use the terminology in the guidance.

	</details>

- [ ]  Document includes all the component variants listed in the guidelines.<br>
	You must include mention of all variants, including those not supported by the platform. Any variants not supported by the platform should be mentioned as 'unsupported', and mention any alternatives to Material.io.

	<details>
		<summary>Example</summary>

	The [Buttons component](https://material.io/components/buttons) has 4 variants: <br>
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

- [ ]  First word of the heading title is capitalized and the remaining words in the title (aside from proper nouns or APIs) are lower-case.
- [ ]  All instances of API names and API attribute names use <code>\`</code> or `\<code\>` tags.
- [ ]  All code samples use <code>\`\`\`\<language\></code>.

	<details>
		<summary>Example</summary>

	\`\`\`html
	\<head\> <br>
	&nbsp;&nbsp;&nbsp;&nbsp;  \<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"\><br>
	\</head\><br>
	\`\`\`
	</details>

- [ ]  The article's component meets [accessibility guidelines](https://sites.google.com/corp/google.com/greenlinesv2/how-to-greenline/greenlines-for-elements#h.p_56wIA8ABpc2P) for labeling.
