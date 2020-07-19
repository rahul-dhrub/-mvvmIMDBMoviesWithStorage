package com.example.likecountmvvmimdbmovies.data;

import java.lang.System;

/**
 * @author : Eduardo Medina
 * @see : https://phauer.com/2019/sealed-classes-exceptions-kotlin/
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/OperationResult;", "T", "", "()V", "Error", "Success", "Lcom/example/likecountmvvmimdbmovies/data/OperationResult$Success;", "Lcom/example/likecountmvvmimdbmovies/data/OperationResult$Error;", "app_debug"})
public abstract class OperationResult<T extends java.lang.Object> {
    
    private OperationResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u00c6\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/OperationResult$Success;", "T", "Lcom/example/likecountmvvmimdbmovies/data/OperationResult;", "data", "", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.example.likecountmvvmimdbmovies.data.OperationResult<T> {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<T> data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<T> getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<T> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.likecountmvvmimdbmovies.data.OperationResult.Success<T> copy(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0019\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/OperationResult$Error;", "Lcom/example/likecountmvvmimdbmovies/data/OperationResult;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error extends com.example.likecountmvvmimdbmovies.data.OperationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Exception exception = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.likecountmvvmimdbmovies.data.OperationResult.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}