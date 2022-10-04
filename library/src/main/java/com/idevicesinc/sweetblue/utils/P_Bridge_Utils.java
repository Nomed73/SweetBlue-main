/*

  Copyright 2022 Hubbell Incorporated

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.

  You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

 */

package com.idevicesinc.sweetblue.utils;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import com.idevicesinc.sweetblue.BleAdvertisingSettings;


public class P_Bridge_Utils
{

    private P_Bridge_Utils()
    {
        throw new RuntimeException("No instances!");
    }


    public static AdvertiseSettings getNativeSettings(BleScanRecord packet, BleAdvertisingSettings.BleAdvertisingMode mode, BleAdvertisingSettings.BleTransmissionPower power, Interval timeout)
    {
        return packet.getNativeSettings(mode, power, timeout);
    }

    public static AdvertiseData getNativeData(BleScanRecord packet)
    {
        return packet.getNativeData();
    }

}