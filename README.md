# create-new-rnLib
example on how to create a bridge between Java and react-native

import test from 'create-new-rnLib';

// haven't figured out how to use the traditional return, so I used promise instead
// simple function to add 2 values
// will try to use ReadableMap in the future

test.testing(1 /** first int*/ , 2 /** second int */).then((resolve) => {
  // do something
});
