package com.example.likecountmvvmimdbmovies.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/model/MovieDbRepository;", "", "dataSource", "Lcom/example/likecountmvvmimdbmovies/data/db/DbDataSource;", "(Lcom/example/likecountmvvmimdbmovies/data/db/DbDataSource;)V", "getMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/likecountmvvmimdbmovies/model/Movie;", "sync", "", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieDbRepository {
    private final com.example.likecountmvvmimdbmovies.data.db.DbDataSource dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.likecountmvvmimdbmovies.model.Movie>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sync(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.likecountmvvmimdbmovies.model.Movie> movieList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public MovieDbRepository(@org.jetbrains.annotations.NotNull()
    com.example.likecountmvvmimdbmovies.data.db.DbDataSource dataSource) {
        super();
    }
}