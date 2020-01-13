# Developement article accessibility examples and guidelines

This document shows the accessibility expectations for the deveoper-focused documents written in GitHub-flavored MarkDown, and focuses on best practices for writing introductory text and alt-text for image and diagram alt-text.

## Introductory text and alt-text

MarkDown has a limited palette of accessibility tools, and has no native image caption capability.

The introductory text should succintly describe the image within the context of the document.

The alt-text should describe relevant visual details, as though the image didn't load. Avoid alt-text over 125 characters because many optical character readers (OCRs) do not support long alt-text. If you feel you need the extra description, load the more relavent information at the beginning of the alt-text. 

## Image examples

Images for developer articles are screenshots to illustrate component types or render sample code. 

For example, if an image illustrates a type, the introductory text would be part of the document introduction and the alt-text would be succint because the customizations would be described elsewhere:

> The text field class consists of the following types:
>
> 1. [Filled text](#filled-text)
> 1. [Outlined text](#outlined-text)
>
> ![Text field examples of both filled and outlined types, and each type showing both inactive and focused states. The filled text fields show a gray background and a darker gray activation indicator that is purple when focused. The outlined text fields show a clear background and an outline that is purple when focused](accessibility-assets/text-field-generic.png)

The alt-text reads:

	Text field examples of both filled and outlined types, and each type showing both inactive and focused states. 
	The filled text fields show a gray background and a darker gray activation indicator that is purple when focused.
	The outlined text fields show a clear background and an outline that is purple when focused

If an image is a render from sample code, you should describe what was included in the intructory text, and describe the color and relative position of any attributes.

> The following is an example of a bottom application bar with icons and an overlapping floating action button:
>
> ![Example, purple bottom application bar with white icons and an overlapping centered black floating action button. The application bar has a 3 white icons: menu icon to the far left, search icon and more icon to the far right. The floating action button has a white plus icon.](accessibility-assets/bottom-nav-example.png)

The alt-text reads:

	Example, purple bottom application bar with white icons and an overlapping centered black floating action button.
	The application bar has a 3 white icons: menu icon to the far left, search icon and more icon to the far right.
	The floating action button has a white plus icon.




## Diagram examples

Diagrams are usually screenshots that include callouts to convey specific technical information, but can include videos and animations. MarkDown does not natively support embedded video content, but can support animated GIFs.

For example the following is an introduction and diagram for a dialog component:

> The following is the anatomy diagram for the dialog component:
>
> ![Dialog component anatomy with labels for the container, title, supporting text, buttons, scrim](accessibility-assets/dialogs-anatomy-diagram-example.png)


The alt-text reads:

	Dialog component anatomy with labels for the container, title, supporting text, buttons, scrim


