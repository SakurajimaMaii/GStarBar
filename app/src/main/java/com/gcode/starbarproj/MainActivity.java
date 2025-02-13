/*
 * Copyright VastGui 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gcode.starbarproj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import cn.govast.starbar.StarBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StarBar mStarbar = (StarBar) findViewById(R.id.sbv_starbar);

        Button button = (Button) findViewById(R.id.button_2);

        button.setWidth(40);
        button.setHeight(40);

        //拿到当前星星数量
        mStarbar.getStarRating();
//        try {
//            mStarbar.setStarRating(10f);
//        } catch (GStarRatingNumberException e) {
//            e.printStackTrace();
//        }

        try {
            mStarbar.setStarBitMapSize(40,40);
        } catch (StarBar.StarBarIllegalParamException e) {
            e.printStackTrace();
        }
    }
}
