<!--docs:
title: "Dialogs"
layout: detail
section: components
excerpt: "Dialogs are modal windows that require interaction."
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

Before using the `MaterialDialogs` API to implement its types you must install `MaterialDialogs`. In your source files import the component, and then apply your theme:

1. Use CocoaPods to install `Dialogs`
  1. Add the following line to your `Podfile`:
    ```java
    pod MaterialComponents/Dialogs
    ```
  1. Run the installer:
    ```bash
    pod install
    ```

1. Import `MaterialDialogs` and MDC dialog theming and initialize `MaterialDialogs` using `alloc`/`init`. Initialize your theme  before applying it to your dialog.

   _**Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS._

    <!--<div class="material-code-render" markdown="1">-->
   **Swift**
   ```swift
   import MaterialComponents.Dialogs
   import MaterialComponents.Dialogs_Theming
   /*...*/
   let <local theme name> = <theme name>
   let button = MaterialDialog()
   ```
   **Objective-C**
   ```objc
   #import "Dialogs.h"
   #import <MaterialComponents/Dialogs+Theming.h>
   /*...*/
   <theme name> *<local theme name> = [[<theme name> alloc] init];
   MDCButton *button = [[MaterialDialog alloc] init];
   ```
    <!--</div>-->

    For our examples, we used the following theming values:

    <!--<div class="material-code-render" markdown="1">-->
   **Swift**
   ```swift
   let MyMaterialTheme = MDCContainerScheme()
   ```
   **Objective-C**
   ```objc
   MDCContainerScheme *MyMaterialTheme = []
   ```
    <!--</div>-->

### Making dialogs accessible

`MDCPresentationController` is responsible for the presentation of your custom view controllers; it does not implement any accessibility functionality itself.

__**Note to developers: Which files do these snippets go with?**__

```
-accessibilityPerformEscape Behavior
```

If you intend your presented view controller to dismiss when a user in VoiceOver mode has performed the escape gesture the view controller should implement the accessibilityPerformEscape method.

```
- (BOOL)accessibilityPerformEscape {
  [self.presentingViewController dismissViewControllerAnimated:YES completion:NULL];
  return YES;
}
```

## Alert dialog

Alert dialogs interrupt users with urgent information, details, or actions.

### Alert dialog example

__**Note to developers: provide links to the APIs**__

**Source code APIs**

\<Class name\>
* \<link to class description\>
* \<link to class API documentation\>

__**Note to developers: provide an example alert dialog with the following features:**__

* Supporting text reading "alert dialog supporting text"
* Two buttons reading "Action 1" and "Action 2"
* Scrim of your choice


### Alert dialog anatomy and key properties

The alert dialog contains the following:

![alert dialog anatomy diagram](assets/dialog-anatomy.png)
1. Container
1. Title (optional)
1. Supporting text
1. Buttons
1. Scrim

**Container**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Title (optional)**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Supporting text**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Buttons**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Scrim**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |


## Simple dialog

Simple dialogs can display items that are immediately actionable when selected. They don’t have text buttons.

As simple dialogs are interruptive, they should be used sparingly. Alternatively, dropdown menus provide options in a non-modal, less disruptive way.

### Simple dialog example

__**Note to developers: provide links to the APIs**__

**Source code APIs**

\<Class name\>
* \<link to class description\>
* \<link to class API documentation\>

__**Note to developers: provide an example simple (modal?) dialog with the following features:**__

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

| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Title**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**List item supporting visual**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**List item primary text**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Button**

| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Scrim**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |



## Confirmation dialog
__**Note to developers: Does iOS support this type?**__

Confirmation dialogs give users the ability to provide final confirmation of a choice before committing to it, so they have a chance to change their minds if necessary.

If the user confirms a choice, it’s carried out. Otherwise, the user can dismiss the dialog. For example, users can listen to multiple ringtones but only make a final selection upon tapping “OK.”

### Confirmation dialog example

### Confirmation dialog anatomy and key properties

A confirmation dialog contains the following:

![confirmation dialog anatomy diagram](assets/Dialogs_Confirmation_anatomy.png)


1. Container
1. Title
1. List item
    1. List control
    1. Primary text
1. Buttons
1. Scrim

**Container**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Title**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**List item control**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**List item primary text**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Buttons**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Scrim**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |


## Full-screen dialog
__**Note to developers: Does iOS support this type?**__


Full-screen dialogs group a series of tasks, such as creating a calendar entry with the event title, date, location, and time. Because they take up the entire screen, full-screen dialogs are the only dialogs over which other dialogs can appear.dia

### Full-screen dialog example

### Full-screen dialog anatomy and key properties
The full-screen dialog contains the following properties:

![full-screen dialog anatomy](assets/Dialogs_FullScreen_anatomy_no-container.png)

1. Title
1. Icon button
1. Buttons
1. Scrim

**Title**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Icon button**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Buttons**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |

**Scrim**
| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |


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
* Use the [Cards](https://github.com/mingjane-work/doc-material-components/blob/mingjane-doc-branch/cards-examples/iOS/assets/cards_theming.png) themed image as the scrim (incomplete as of 2020-03-03)
