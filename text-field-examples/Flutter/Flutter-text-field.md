<!--docs:
title: "Text field"
layout: detail
section: components
excerpt: "<Platform name> Text field"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

_**Instructions**_
* [Using text field](#using-text-field)
    * Add a link under [Using text field](#using-text-field) to your getting started page if you have one
    * Insert [installation](#installation) and [theming](#theming) as appropriate for your platform
    * Insert any additional instructions that apply to your platform with a separte level 3 header
    * If you have no getting started links or instructions, delete the [Using text field](#using-text-field) sections
* [Filled text](#filled-text) ane [Outlined-text](#outlined-text) sections
    * Add links to your platform 


# Text field

[Text fields](https://material.io/components/text-fields) let users enter and edit text.

The text field class consists of the following types:

* [Filled text](#filled-text)
* [Outlined text](#outlined-text)

<img src="assets/text-field-generic.png" alt="Text field examples of both filled and outlined types, and each type showing both inactive and focused states. The filled text fields show a gray background and a darker gray activation indicator that is purple when focused. The outlined text fields show a clear background and an outline that is purple when focused">

## Using text fields

Text fields allow users to enter text into a UI. They typically appear in forms and dialogs.

### Making text fields accessible

Flutter's text field component APIs supports both label text and helper text for accessibility. 

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).


## Filled text

[Filled text fields](https://material.io/components/text-fields/#filled-text-field) have more visual emphasis than outlined text fields, making them stand out when surrounded by other content and components.

### Filled text example

Source code API:

* `TextInputLayout` 
  * [Class definition]()
  * [GitHub source](https://github.com/material-components/)

The following examples shows a filled text field.


_**Copy the image to your platform's assets folder. Use a screenshot of your render.**_


<img src="assets/filled_text_field_form.png" alt="filled text field for Flutter">

```
 TextFormField(
   cursorColor: Theme.of(context).cursorColor,
   initialValue: 'Input text',
   maxLength: 20,
   decoration: InputDecoration(
     icon: Icon(Icons.favorite),
     labelText: 'Label text',
     labelStyle: TextStyle(
       color: Color(0xFF6200EE),
     ),
     helperText: 'Helper text',
     suffixIcon: Icon(
       Icons.check_circle,
     ),
     enabledBorder: UnderlineInputBorder(
       borderSide: BorderSide(color: Color(0xFF6200EE)),
     ),
   ),
 ),
```

To test code copy and pasta code into dartpad.
Add this code to [dartpad.dev](https://dartpad.dev/)

```
// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      home: MyHomePage(title: 'Flutter Demo Text Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Widget build(BuildContext context) {
    return Scaffold(
      body: TextFormField(
        cursorColor: Theme.of(context).cursorColor,
        initialValue: 'Input text',
        maxLength: 20,
        decoration: InputDecoration(
          icon: Icon(Icons.favorite),
          labelText: 'Label text',
          labelStyle: TextStyle(
            color: Color(0xFF6200EE),
          ),
          helperText: 'Helper text',
          suffixIcon: Icon(
            Icons.check_circle,
          ),
          enabledBorder: UnderlineInputBorder(
            borderSide: BorderSide(color: Color(0xFF6200EE)),
          ),
        ),
      ),
    );
  }
}
```

### Anatomy and key properties

![Filled text field anatomy](assets/textfields_filled_anatomy.png)

1. Container
1. Leading icon (optional)
1. Label text
1. Input text
1. Trailing icon (optional)
1. Activation indicator
1. Helper text (optional)




<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Property | 
| --- | --- | 
| **Color** | style |
| **Stroke color** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Stroke width** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Shape** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Elevation** | N/A|
| **Ripple color** | N/A|

</details>


<details>
<summary><b>Leading icon</b> (optional) attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Icon** | Use decoration, within decoration use icon property|
| **Color** | When creating the icon property you have the option to use the color parameter|
| **Size** | When creating the icon property you have the option to use the size parameter|
| **Gravity** | N/A |
| **Padding** | N/A |


</details>


<details>
<summary><b>Label text</b> attributes</summary>
<br>

|  | Property |
| --- | --- | 
| **Label text** | Use decoration, within decoration use labelText property |
| **Typography** | Use decoration, within decoration use labelStyle property |
| **Color** | Use decoration, within decoration use labelStyle property |

</details>


<details>
<summary><b>Input text</b> attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Label text** | initialValue |
| **Typography** | style |
| **Color** | style |

</details>


<details>
<summary><b>Trailing icon</b> (optional) attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Icon** | Use decoration, within decoration use suffixIcon property|
| **Color** | When creating the suffixIcon property you have the option to use the color parameter|
| **Size** | When creating the suffixIcon property you have the option to use the size parameter|
| **Gravity** | N/A |
| **Padding** | N/A |

</details>


<details>
<summary><b>Activation indicator</b> attributes</summary>
<br>

|  | Property|
| --- | --- |
| **Stroke color** | Use decoration, within decoration use FocusBorder|
| **Stroke width** | Use decoration, within decoration use FocusBorder|
| **Ripple color** | N/A|

</details>


<details>
<summary><b>Helper text</b> (optional) attributes</summary>
<br>

|  | Property|
| --- | --- |
| **Label text** | Use decoration, within decoration use helperText property |
| **Typography** | Use decoration, within decoration use helperStyle property |
| **Color** | Use decoration, within decoration use helperStyle property |

</details>

<summary><b>Styles</b></summary>
<br>

|  | Property |
| --- | --- |
| **Default style** | style |
| **Icon style** | Within the style icon |

</details>

## Outlined text

[Outlined text fields](https://material.io/components/text-fields/#outlined-text-field) have less visual emphasis than filled text fields. When they appear in places like forms, where many text fields are placed together, their reduced emphasis helps simplify the layout.

### Outlined text example

Source code API:

* `TextInputLayout` 
  * [Class definition]()
  * [GitHub source]()

The following examples shows an outlined text field.

_**Copy the image to your platform's assets folder. Use a screenshot of your render.**_
<img src="assets/outline_text_field_form.png" alt="Outline text field for Flutter">

```
TextFormField(
  initialValue: 'Input text',
  decoration: InputDecoration(
    labelText: 'Label text',
    errorText: 'Error message',
    border: OutlineInputBorder(),
    suffixIcon: Icon(
      Icons.error,
    ),
  ),
),
```

To test code copy and pasta code into dartpad.
Add this code to [dartpad.dev](https://dartpad.dev/)

```
// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      home: MyHomePage(title: 'Flutter Demo Text Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Widget build(BuildContext context) {
    return Scaffold(
      body: TextFormField(
        initialValue: 'Input text',
        decoration: InputDecoration(
          labelText: 'Label text',
          errorText: 'Error message',
          border: OutlineInputBorder(),
          suffixIcon: Icon(
            Icons.error,
          ),
        ),
      ),
    );
  }
}
```

### Anatomy and key properties

![Outlined text field anatomy](assets/textfields_outlined_anatomy.png)

1. Container
1. Leading icon (optional)
1. Label text
1. Input text
1. Trailing icon (optional)
1. Activation indicator
1. Helper text (optional)

Note: If ThemeData has been declared in the MaterialApp widget it will override the theme that was manually input it like the activation indicator.

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Color** | style |
| **Stroke color** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Stroke width** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Shape** | decoration, inside decoration use the parameter border, disabledBorder, enabledBorder, errorBorder, focusedBorder, focusedErrorBorder|
| **Elevation** | N/A|
| **Ripple color** | N/A|

</details>


<details>
<summary><b>Leading icon</b> (optional) attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Icon** | Use decoration, within decoration use icon property|
| **Color** | When creating the icon property you have the option to use the color parameter|
| **Size** | When creating the icon property you have the option to use the size parameter|
| **Gravity** | N/A |
| **Padding** | N/A |


</details>


<details>
<summary><b>Label text</b> attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Label text** | Use decoration, within decoration use labelText property |
| **Typography** | Use decoration, within decoration use labelStyle property |
| **Color** | Use decoration, within decoration use labelStyle property |

</details>


<details>
<summary><b>Input text</b> attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Label text** | initialValue |
| **Typography** | style |
| **Color** | style |

</details>


<details>
<summary><b>Trailing icon</b> (optional) attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Icon** | Use decoration, within decoration use suffixIcon property|
| **Color** | When creating the suffixIcon property you have the option to use the color parameter|
| **Size** | When creating the suffixIcon property you have the option to use the size parameter|
| **Gravity** | N/A |
| **Padding** | N/A |

</details>


<details>
<summary><b>Activation indicator</b> attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Stroke color** | Use decoration, within decoration use FocusBorder|
| **Stroke width** | Use decoration, within decoration use FocusBorder|
| **Ripple color** | N/A|

</details>


<details>
<summary><b>Helper text</b> (optional) attributes</summary>
<br>

|  | Property |
| --- | --- |
| **Label text** | Use decoration, within decoration use helperText property |
| **Typography** | Use decoration, within decoration use helperStyle property |
| **Color** | Use decoration, within decoration use helperStyle property |

</details>

<summary><b>Styles</b></summary>
<br>

|  | Property |
| --- | --- |
| **Default style** | style |
| **Icon style** | Within the style icon |

</details>

## Theming text fields

Text fields support [Material Theming](https://material.io/components/text-fields/#theming) and can be customized in terms of color, typography and shape.

### Text field theming example

API and source code:

* `\<Component platform API name\>`
    * [Class description](https://)
    * [GitHub source](https://github.com/material-components/)
    
The following example shows filled and outlined text fields with Material Theming.

!["Two text fields, one filled, one outlined, with green/black color theming and cut corners."](assets/button-theming.svg)

<details>
<summary><b>Implementing text field theming</b></summary>

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_


<img src="assets/shrine_text_field_form.png" alt="Shrine text field for Flutter">

To test code copy and pasta code into dartpad.
Add this code to [dartpad.dev](https://dartpad.dev/)
```

// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: _buildShrineTheme(),
      home: MyHomePage(title: 'Flutter Demo Text Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(children: [
        TextFormField(
          cursorColor: Theme.of(context).cursorColor,
          initialValue: 'Input text',
          maxLength: 20,
          decoration: InputDecoration(
            icon: Icon(Icons.favorite),
            labelText: 'Label text',
            helperText: 'Helper text',
            suffixIcon: Icon(
              Icons.check_circle,
            ),
          ),
        ),
        TextFormField(
          cursorColor: Theme.of(context).cursorColor,
          initialValue: 'Input text',
          maxLength: 20,
          decoration: InputDecoration(
            icon: Icon(Icons.favorite),
            labelText: 'Label text',
            helperText: 'Helper text',
            errorText: 'Error message',
            suffixIcon: Icon(
              Icons.error,
            ),
          ),
        ),
      ]),
    );
  }
}

IconThemeData _customIconTheme(IconThemeData original) {
  return original.copyWith(color: shrineBrown900);
}

ThemeData _buildShrineTheme() {
  final ThemeData base = ThemeData.light();
  return base.copyWith(
    colorScheme: _shrineColorScheme,
    accentColor: shrineBrown900,
    primaryColor: shrinePink100,
    buttonColor: shrinePink100,
    scaffoldBackgroundColor: shrineBackgroundWhite,
    cardColor: shrineBackgroundWhite,
    textSelectionColor: shrinePink100,
    errorColor: shrineErrorRed,
    buttonTheme: const ButtonThemeData(
      colorScheme: _shrineColorScheme,
      textTheme: ButtonTextTheme.normal,
    ),
    primaryIconTheme: _customIconTheme(base.iconTheme),
    textTheme: _buildShrineTextTheme(base.textTheme),
    primaryTextTheme: _buildShrineTextTheme(base.primaryTextTheme),
    accentTextTheme: _buildShrineTextTheme(base.accentTextTheme),
    iconTheme: _customIconTheme(base.iconTheme),
  );
}

TextTheme _buildShrineTextTheme(TextTheme base) {
  return base
      .copyWith(
        headline: base.headline.copyWith(
          fontWeight: FontWeight.w500,
          letterSpacing: defaultLetterSpacing,
        ),
        title: base.title.copyWith(
          fontSize: 18,
          letterSpacing: defaultLetterSpacing,
        ),
        caption: base.caption.copyWith(
          fontWeight: FontWeight.w400,
          fontSize: 14,
          letterSpacing: defaultLetterSpacing,
        ),
        body2: base.body2.copyWith(
          fontWeight: FontWeight.w500,
          fontSize: 16,
          letterSpacing: defaultLetterSpacing,
        ),
        body1: base.body1.copyWith(
          letterSpacing: defaultLetterSpacing,
        ),
        subhead: base.subhead.copyWith(
          letterSpacing: defaultLetterSpacing,
        ),
        display1: base.display1.copyWith(
          letterSpacing: defaultLetterSpacing,
        ),
        button: base.button.copyWith(
          fontWeight: FontWeight.w500,
          fontSize: 14,
          letterSpacing: defaultLetterSpacing,
        ),
      )
      .apply(
        fontFamily: 'Rubik',
        displayColor: shrineBrown900,
        bodyColor: shrineBrown900,
      );
}

const ColorScheme _shrineColorScheme = ColorScheme(
  primary: shrinePink100,
  primaryVariant: shrineBrown900,
  secondary: shrinePink50,
  secondaryVariant: shrineBrown900,
  surface: shrineSurfaceWhite,
  background: shrineBackgroundWhite,
  error: shrineErrorRed,
  onPrimary: shrineBrown900,
  onSecondary: shrineBrown900,
  onSurface: shrineBrown900,
  onBackground: shrineBrown900,
  onError: shrineSurfaceWhite,
  brightness: Brightness.light,
);

const Color shrinePink50 = Color(0xFFFEEAE6);
const Color shrinePink100 = Color(0xFFFEDBD0);
const Color shrinePink300 = Color(0xFFFBB8AC);
const Color shrinePink400 = Color(0xFFEAA4A4);

const Color shrineBrown900 = Color(0xFF442B2D);
const Color shrineBrown600 = Color(0xFF7D4F52);

const Color shrineErrorRed = Color(0xFFC5032B);

const Color shrineSurfaceWhite = Color(0xFFFFFBFA);
const Color shrineBackgroundWhite = Colors.white;

const defaultLetterSpacing = 0.03;

```
</details>
