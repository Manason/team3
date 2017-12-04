/**
 * Copyright (C) 2013 the original author or authors.
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

package controllers;

import models.EnglishGame;
import models.SpanishGame;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;

@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }
    
    public Result gameGet(Context context){
        if(context.getRequestPath().contains("spanishGame")){
            SpanishGame g = new SpanishGame();
            return Results.json().render(g);
        }
        else {
            EnglishGame g = new EnglishGame();
            return Results.json().render(g);
        }
    }

    public Result dealPost(Context context, EnglishGame g) {
        g.dealFour();
        System.out.println(g.getClass());
        return Results.json().render(g);
    }
    public Result dealPostS(Context context, SpanishGame g) {
        g.dealFour();
        System.out.println(g.getClass());
        return Results.json().render(g);
    }

    public Result removeCard(Context context, @PathParam("column") int colNumber, EnglishGame g){
        g.cols.remove(colNumber);
        return Results.json().render(g);
    }
    public Result removeCardS(Context context, @PathParam("column") int colNumber, SpanishGame g){
        g.cols.remove(colNumber);
        return Results.json().render(g);
    }

    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, EnglishGame g){
        g.cols.move(colFrom,colTo);
        return Results.json().render(g);
    }
    public Result moveCardS(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, SpanishGame g){
        g.cols.move(colFrom,colTo);
        return Results.json().render(g);
    }

    public Result resetGame(Context context, EnglishGame g) {
        if(context.getRequestPath().contains("reset")){
            g.resetGame();
        }
        return Results.json().render(g);
    }
    public Result resetGameS(Context context, SpanishGame g) {
        if(context.getRequestPath().contains("reset")){
            g.resetGame();
        }
        return Results.json().render(g);
    }
}
