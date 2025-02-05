import React from "react";
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";

import "./App.css";

import AddWatchedMovie from "./AddWatchedMovie";
import Home from "./Home";
import SuggestedMovies from "./SuggestedMovies";
import WatchedMovies from "./WatchedMovies";

const App = () => {
    return (
        <Router>
            <Routes>
                <Route exact path="/" element={<Home />} />
                <Route
                    exact
                    path="/new-movies/:genre"
                    element={<SuggestedMovies />}
                />
                <Route exact path="/old-movies" element={<WatchedMovies />} />
                <Route
                    exact
                    path="/old-movies/add"
                    element={<AddWatchedMovie />}
                />
            </Routes>
        </Router>
    );
};

export default App;
