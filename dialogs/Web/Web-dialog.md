<!--docs:
title: "Dialogs"
layout: detail
section: components
excerpt: "Dialogs are windows that require interaction."
iconId: 
path: /catalog/dialog/
-->


# Dialogs

Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.

There are four types of dialogs:

1. [Alert](#alert-dialog)
1. [Simple](#simple-dialog)
1. [Confirmation](#confirmation-dialog)
1. [Full-screen](#full-screen-dialog)

<br>

1. <img src="assets/alert-dialog.png" alt="Alert dialog: discard" width=50%>
1. <img src="assets/simple-dialog.png" alt="Simple dialog: selection" width=50%>
1. <img src="assets/confirmation-dialog.png" alt="Confirmation dialog: selection confirmation" width=50%>
1. <img src="assets/full-screen-dialog.png" alt="Full-screen dialog: event" width=50%>

## Using dialogs

A dialog is a type of modal window that appears in front of app content to provide critical information or ask for a decision. Dialogs disable all app functionality when they appear, and remain on screen until confirmed, dismissed, or a required action has been taken.

Dialogs are purposefully interruptive, so they should be used sparingly.


For additional guidance, refer to the [Material guidelines](https://material.io/go/design-dialogs)

### Installing dialogs

Before you can use dialogs, you will need to install and import the following:

* Install the Material dialog component
* Import JavaScript

### Install the Material dialog component

Install the `mdc-dialog` component before including it in your source.


**`mdc-dialog`**
```bash
npm install @material/dialog
```

### Import JavaScript


```js
import {MDCDialog} from '@material/dialog';
const dialog = new MDCDialog(document.querySelector('.mdc-dialog'));
```

See [Importing the JS component](../../docs/importing-js.md) for more information on how to import JavaScript.

MDC Dialog makes no assumptions about what will be added to the `mdc-dialog__content` element. Any List, Checkboxes,
etc. must also be instantiated. If your dialog contains any layout-sensitive components, you should wait until the dialog is open (`MDCDialog:opened`) before instantiating them (or call `layout` on them) so that the dialog's transition finishes
first.

For example, to instantiate an MDC List inside of a Simple or Confirmation Dialog in your JavaScript file:

```js
import {MDCList} from '@material/list';
const list = new MDCList(document.querySelector('.mdc-dialog .mdc-list'));

dialog.listen('MDCDialog:opened', () => {
  list.layout();
});
```

### Making dialogs accessible

`aria-modal` is part of the ARIA 1.1 specification, and indicates to screen readers that they should confine themselves to a single element. We recommend adding `aria-modal="true"` to the root element of its DOM structure.

However, not all user agents and screen readers properly interpret this attribute.

The fallback is to use `aria-hidden` using `aria-hidden="true"` to all static content beneath the dialog when the dialog is open. This will be easiest to achieve if all non-modal elements are under a single common ancestor under the body, so that `aria-hidden` can be applied to one element.

```js
dialog.listen('MDCDialog:opened', function() {
  // Assuming contentElement references a common parent element with the rest of the page's content
  contentElement.setAttribute('aria-hidden', 'true');
});
dialog.listen('MDCDialog:closing', function() {
  contentElement.removeAttribute('aria-hidden');
});
```

**Note:** The example above intentionally listens to the opened (not opening) event and the closing (not closed) event in order to avoid additional jumping between elements by screen readers due to one element becoming hidden before others become visible.

__**Note to developers: What types of dialogs are actually supported in Web?**__

### Sass mixins

Use Sass mixins when you want to customize the look and feel of your dialogs. Go to [sass-lang.com](https://sass-lang.com/install) for installation instructions.

Go to the bottom of this document for a [theming example](#dialog-theming-example) using Sass mixins.

The following mixins are available to customize your `mdc-dialog` instance.

Mixin | Description
---|---
`container-fill-color($color)` | Sets the container fill color to the given color.
`icon-color($color)` | Sets the icon color to the given color.
`ink-color($color)` | Sets the ink color to the given color, and sets the icon color to the given color unless `icon-color` is also used.
`shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to dialog with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`horizontal-padding($padding)` | Sets horizontal padding to the given number.
`outline-color($color)` | Sets the outline color to the given color.
`outline-width($width, $padding)` | Sets the outline width to the given number (defaults to 2px) and adjusts padding accordingly. `$padding` is only required in cases where `horizontal-padding` is also included with a custom value.


## Alert dialog

Alert dialogs interrupt users with urgent information, details, or actions.

### Alert dialog example

* `mdc-dialog`
  * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-dialog)


### Alert dialog anatomy and key properties

The alert dialog contains the following:

![alert dialog anatomy diagram](assets/dialog-anatomy.png)

1. Container
1. Title (optional)
1. Supporting text
1. Buttons
1. Scrim

**Container**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Title (optional)**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Supporting text**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Buttons**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Scrim**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---


## Simple dialog

Simple dialogs can display items that are immediately actionable when selected. They don’t have text buttons.

As simple dialogs are interruptive, they should be used sparingly. Alternatively, dropdown menus provide options in a non-modal, less disruptive way.

### Simple dialog example

* `mdc-dialog`
  * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-dialog)

__**Note to developers: provide an example and screenshot of a simple dialog with the following features:**__

* Title reading "Simple dialog text"
* Two buttons reading "Action 1" and "Action 2"
* A list of radio buttons and choices reading "Choice 1", "Choice 2", "Choice 3" ... up to "Choice 5"
* Scrim of your choice


### Simple dialog anatomy and key properties

A simple dialog contains the following:


![simple dialog anatomy diagram](assets/Dialogs_SimpleDIalog_anatomy.png)

1. Container
1. Title 
1. List item
  1. Supporting visual
  1. Primary text
1. Button
1. Scrim

**Container**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Title**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |


**List item supporting visual**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**List item primary text**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |
**Button**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |
**Scrim**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |



## Confirmation dialog

Confirmation dialogs give users the ability to provide final confirmation of a choice before committing to it, so they have a chance to change their minds if necessary.

If the user confirms a choice, it’s carried out. Otherwise, the user can dismiss the dialog. For example, users can listen to multiple ringtones but only make a final selection upon tapping “OK.”

### Confirmation dialog example

* `mdc-dialog`
  * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-dialog)


### Confirmation dialog anatomy and key properties

A confirmation dialog contains the following:
![confirmation dialog anatomy diagram](assets/Dialog_Confirmation_anatomy.png)


1. Container
1. Title
1. List item
  1. List control
  1. Primary text
1. Buttons
1. Scrim

**Container**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Title**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**List item List control**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**List item primary text**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Buttons**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Scrim**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |


## Full-screen dialog

Full-screen dialogs group a series of tasks, such as creating a calendar entry with the event title, date, location, and time. Because they take up the entire screen, full-screen dialogs are the only dialogs over which other dialogs can appear.dia

### Full-screen dialog example

* `mdc-dialog`
  * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-dialog)


### Full-screen dialog anatomy and key properties

The full-screen dialog contains the following properties:

![full-screen dialog anatomy](assets/Dialogs_FullScreen_anatomy_no-container.png)

1. Title
1. Icon button
1. Button
1. Scrim

**Container**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Icon button**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Button**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |

**Scrim**

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
| |


## Dialog theming

### Dialog theming example


__**Note to developers** Provide an example with the following features using the [Shrine theme](https://material.io/design/material-studies/shrine.html#about-shrine)__
* Create a simple dialog
* Add a title "Title"
* Add 3 radio buttons with the following options:
  * "option 1"
  * "option 2"
  * "option 3"
* Add two text buttons to the bottom:
  * "Action 1"
  * "Action 2"
* Use the [Cards](https://github.com/mingjane-work/doc-material-components/blob/mingjane-doc-branch/cards-examples/Web/assets/cards_theming.png) themed image as the scrim (incomplete as of 2020-03-03)


## `mdc-dialog` APIs and customizations

### CSS Classes

CSS Class | Description
--- | ---
`mdc-dialog` | Mandatory. The root DOM element containing the surface and the container.
`mdc-dialog__scrim` | Mandatory. Semitransparent backdrop that displays behind a dialog.
`mdc-dialog__container` | Mandatory. Wrapper element needed to ensure flexbox behavior in IE 11.
`mdc-dialog__surface` | Mandatory. The bounding box for the dialog's content.
`mdc-dialog__title` | Optional. Brief summary of the dialog's purpose.
`mdc-dialog__content` | Optional. Primary content area. May contain a list, a form, or prose.
`mdc-dialog__actions` | Optional. Footer area containing the dialog's action buttons.
`mdc-dialog__button` | Optional. Individual action button. Typically paired with [`mdc-button`](../mdc-button).
`mdc-dialog--open` | Optional. Indicates that the dialog is open and visible.
`mdc-dialog--opening` | Optional. Applied automatically when the dialog is in the process of animating open.
`mdc-dialog--closing` | Optional. Applied automatically when the dialog is in the process of animating closed.
`mdc-dialog--scrollable` | Optional. Applied automatically when the dialog has overflowing content to warrant scrolling.
`mdc-dialog--stacked` | Optional. Applied automatically when the dialog's action buttons can't fit on a single line and must be stacked.

### Sass Mixins

Mixin | Description
--- | ---
`container-fill-color($color)` | Sets the fill color of the dialog.
`scrim-color($color, $opacity)` | Sets the color of the scrim behind the dialog.
`title-ink-color($color, $opacity)` | Sets the color of the dialog's title text.
`content-ink-color($color, $opacity)` | Sets the color of the dialog's content text.
`scroll-divider-color($color, $opacity)` | Sets the color of the dividers which display around scrollable content.
`shape-radius($radius, $rtl-reflexive)` | Sets the rounded shape to dialog surface with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`min-width($min-width)` | Sets the minimum width of the dialog (defaults to 280px).
`max-width($max-width, $margin)` | Sets the maximum width of the dialog (defaults to 560px max width and 16px margins).
`max-height($max-height, $margin)` | Sets the maximum height of the dialog (defaults to no max height and 16px margins).

> *NOTE*: The `max-width` and `max-height` mixins only apply their maximum when the viewport is large enough to accommodate the specified value when accounting for the specified margin on either side. When the viewport is smaller, the dialog is sized such that the given margin is retained around the edges.

## Other Customizations
Data Attributes | Description
--- | ---
`data-mdc-dialog-button-default` | Optional. Add to a button to indicate that it is the default action button (see Default Action Button section above).
`data-mdc-dialog-initial-focus` | Optional. Add to an element to indicate that it is the element to initially focus on after the dialog has opened.

## `MDCDialog` Properties and Methods

Property | Value Type | Description
--- | --- | ---
`isOpen` | `boolean` (read-only) | Proxies to the foundation's `isOpen` method.
`escapeKeyAction` | `string` | Proxies to the foundation's `getEscapeKeyAction` and `setEscapeKeyAction` methods.
`scrimClickAction` | `string` | Proxies to the foundation's `getScrimClickAction` and `setScrimClickAction` methods.
`autoStackButtons` | `boolean` | Proxies to the foundation's `getAutoStackButtons` and `setAutoStackButtons` methods.

Method Signature | Description
--- | ---
`layout() => void` | Recalculates layout and automatically adds/removes modifier classes like `--scrollable`.
`open() => void` | Opens the dialog.
`close(action: string?) => void` | Closes the dialog, optionally with the specified action indicating why it was closed.

### Events

Event Name | `event.detail` | Description
--- | --- | ---
`MDCDialog:opening` | `{}` | Indicates when the dialog begins its opening animation.
`MDCDialog:opened` | `{}` | Indicates when the dialog finishes its opening animation.
`MDCDialog:closing` | `{action: string?}` | Indicates when the dialog begins its closing animation. `action` represents the action which closed the dialog.
`MDCDialog:closed` | `{action: string?}` | Indicates when the dialog finishes its closing animation. `action` represents the action which closed the dialog.

## Usage within Web Frameworks

If you are using a JavaScript framework, such as React or Angular, you can create a Dialog for your framework. Depending on your needs, you can use the _Simple Approach: Wrapping MDC Web Vanilla Components_, or the _Advanced Approach: Using Foundations and Adapters_. Please follow the instructions [here](../../docs/integrating-into-frameworks.md).

### `MDCDialogAdapter`

Method Signature | Description
--- | ---
`addClass(className: string) => void` | Adds a class to the root element.
`removeClass(className: string) => void` | Removes a class from the root element.
`hasClass(className: string) => boolean` | Returns whether the given class exists on the root element.
`addBodyClass(className: string) => void` | Adds a class to the `<body>`.
`removeBodyClass(className: string) => void` | Removes a class from the `<body>`.
`eventTargetMatches(target: EventTarget \| null, selector: string) => void` | Returns `true` if the target element matches the given CSS selector, otherwise `false`.
`trapFocus(initialFocusEl: HTMLElement \| null) => void` | Sets up the DOM such that keyboard navigation is restricted to focusable elements within the dialog surface (see [Handling Focus Trapping](#handling-focus-trapping) below for more details). Moves focus to `initialFocusEl`, if set.
`releaseFocus() => void` | Removes any effects of focus trapping on the dialog surface (see [Handling Focus Trapping](#handling-focus-trapping) below for more details).
`getInitialFocusEl() => HTMLElement \| null` | Returns the `data-mdc-dialog-initial-focus` element to add focus to after the dialog has opened.
`isContentScrollable() => boolean` | Returns `true` if `mdc-dialog__content` can be scrolled by the user, otherwise `false`.
`areButtonsStacked() => boolean` | Returns `true` if `mdc-dialog__action` buttons (`mdc-dialog__button`) are stacked vertically, otherwise `false` if they are side-by-side.
`getActionFromEvent(event: Event) => string \| null` | Retrieves the value of the `data-mdc-dialog-action` attribute from the given event's target, or an ancestor of the target.
`clickDefaultButton() => void` | Invokes `click()` on the `data-mdc-dialog-button-default` element, if one exists in the dialog.
`reverseButtons() => void` | Reverses the order of action buttons in the `mdc-dialog__actions` element. Used when switching between stacked and unstacked button layouts.
`notifyOpening() => void` | Broadcasts an event denoting that the dialog has just started to open.
`notifyOpened() => void` | Broadcasts an event denoting that the dialog has finished opening.
`notifyClosing(action: string) {}` | Broadcasts an event denoting that the dialog has just started closing. If a non-empty `action` is passed, the event's `detail` object should include its value in the `action` property.
`notifyClosed(action: string) {}` | Broadcasts an event denoting that the dialog has finished closing. If a non-empty `action` is passed, the event's `detail` object should include its value in the `action` property.

### `MDCDialogFoundation`

Method Signature | Description
--- | ---
`open()` | Opens the dialog.
`close(action: string)` | Closes the dialog, optionally with the specified action indicating why it was closed.
`isOpen() => boolean` | Returns whether the dialog is open.
`layout()` | Recalculates layout and automatically adds/removes modifier classes e.g. `--scrollable`.
`getEscapeKeyAction() => string` | Returns the action reflected when the Escape key is pressed.
`setEscapeKeyAction(action: string)` | Sets the action reflected when the Escape key is pressed. Setting to `''` disables closing the dialog via Escape key.
`getScrimClickAction() => string` | Returns the action reflected when the scrim is clicked.
`setScrimClickAction(action: string)` | Sets the action reflected when the scrim is clicked. Setting to `''` disables closing the dialog via scrim click.
`getAutoStackButtons() => boolean` | Returns whether stacked/unstacked action button layout is automatically handled during layout logic.
`setAutoStackButtons(autoStack: boolean) => void` | Sets whether stacked/unstacked action button layout is automatically handled during layout logic.
`handleClick(event: MouseEvent)` | Handles `click` events on or within the dialog's root element.
`handleKeydown(event: KeyboardEvent)` | Handles `keydown` events on or within the dialog's root element.
`handleDocumentKeydown(event: Event)` | Handles `keydown` events on or within the document while the dialog is open.

#### Event Handlers

When wrapping the Dialog foundation, the following events must be bound to the indicated foundation methods:

Event | Target | Foundation Handler | Register | Deregister
--- | --- | --- | --- | ---
`click` | `.mdc-dialog` (root) | `handleClick` | During initialization | During destruction
`keydown` | `.mdc-dialog` (root) | `handleKeydown` | During initialization | During destruction
`keydown` | `document` | `handleDocumentKeydown` | On `MDCDialog:opening` | On `MDCDialog:closing`
`resize` | `window` | `layout` | On `MDCDialog:opening` | On `MDCDialog:closing`
`orientationchange` | `window` | `layout` | On `MDCDialog:opening` | On `MDCDialog:closing`

### The Util API

External frameworks and libraries can use the following utility methods from the `util` module when implementing their own component.

Method Signature | Description
--- | ---
`createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: function(): !FocusTrap, initialFocusEl: ?Element) => !FocusTrap` | Creates a properly configured [focus-trap][] instance.
`isScrollable(el: Element \| null) => boolean` | Determines if the given element is scrollable.
`areTopsMisaligned(els: Element[]) => boolean` | Determines if two or more of the given elements have different `offsetTop` values.

### Handling Focus Trapping

In order for dialogs to be fully accessible, they must conform to the guidelines outlined in:

* https://www.w3.org/TR/wai-aria-practices/#dialog_modal
* https://www.w3.org/TR/wai-aria-practices-1.1/examples/dialog-modal/dialog.html
* https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_dialog_role

The main implication of these guidelines is that the only focusable elements are those contained within a dialog
surface.

Trapping focus correctly for a modal dialog requires a complex set of events and interaction
patterns that we feel is best not duplicated within the logic of this component. Furthermore,
frameworks and libraries may have their own ways of trapping focus that framework authors may want
to make use of. For this reason, we have two methods on the adapter that should be used to handle
focus trapping:

* `trapFocus()` is called when the dialog is open and should set up focus trapping adhering
  to the ARIA practices in the link above.
* `releaseFocus()` is called when the dialog is closed and should tear down any focus
  trapping set up when the dialog was open.

The `MDCDialog` component uses the [focus-trap][] package to handle this.
**You can use `util.createFocusTrapInstance()` (see below) to easily create
a focus trapping solution for your component code.**

[focus-trap]: https://github.com/davidtheclark/focus-trap

> NOTE: iOS platform doesn't seem to register currently focused element via `document.activeElement` which causes releasing
> focus to last focused element fail.

#### `createFocusTrapInstance()`

```js
const {activate, deactivate} =
  util.createFocusTrapInstance(surfaceEl, focusTrapFactory, initialFocusEl);
```

Given a dialog surface element an optional `focusTrap` factory function, and an optional initial element to focus,
such that:

* The focus is trapped within the `surfaceEl`
* The `initialFocusEl` receives focus when the focus trap is activated
    - If omitted, defaults to the first focusable element in `surfaceEl`
* Closing the dialog in any way (including pressing Escape or clicking outside the dialog) deactivates focus trapping
* Focus is returned to the previously focused element before the focus trap was activated

This focus trap instance can be used to implement the `trapFocus` and `releaseFocus` adapter methods by calling
`instance.activate()` and `instance.deactivate()` respectively within those methods.

The `focusTrapFactory` can be used to override the `focus-trap` function used to create the focus trap. Its API is the
same as focus-trap's [createFocusTrap](https://github.com/davidtheclark/focus-trap#focustrap--createfocustrapelement-createoptions)
(which is what it defaults to). You can pass in a custom function for mocking out the actual function within tests,
or to modify the arguments passed to the function before it's called.
