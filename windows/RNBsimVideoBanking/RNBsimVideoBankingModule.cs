using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Bsim.Video.Banking.RNBsimVideoBanking
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNBsimVideoBankingModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNBsimVideoBankingModule"/>.
        /// </summary>
        internal RNBsimVideoBankingModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNBsimVideoBanking";
            }
        }
    }
}
