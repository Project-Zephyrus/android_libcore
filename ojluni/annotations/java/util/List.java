/*
 * Copyright (c) 1997, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package java.util;


@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface List<E> extends java.util.Collection<E> {

public int size();

public boolean isEmpty();

public boolean contains(@libcore.util.Nullable java.lang.Object o);

@libcore.util.NonNull public java.util.Iterator<E> iterator();

@libcore.util.Nullable public java.lang.Object[] toArray();

public <T> T[] toArray(@libcore.util.Nullable T[] a);

public boolean add(@libcore.util.NullFromTypeParam E e);

public boolean remove(@libcore.util.Nullable java.lang.Object o);

public boolean containsAll(@libcore.util.NonNull java.util.Collection<?> c);

public boolean addAll(@libcore.util.NonNull java.util.Collection<? extends E> c);

public boolean addAll(int index, @libcore.util.NonNull java.util.Collection<? extends E> c);

public boolean removeAll(@libcore.util.NonNull java.util.Collection<?> c);

public boolean retainAll(@libcore.util.NonNull java.util.Collection<?> c);

public default void replaceAll(@libcore.util.NonNull java.util.function.UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }

public default void sort(@libcore.util.Nullable java.util.Comparator<? super E> c) { throw new RuntimeException("Stub!"); }

public void clear();

public boolean equals(@libcore.util.Nullable java.lang.Object o);

public int hashCode();

@libcore.util.NullFromTypeParam public E get(int index);

@libcore.util.NullFromTypeParam public E set(int index, @libcore.util.NullFromTypeParam E element);

public void add(int index, @libcore.util.NullFromTypeParam E element);

@libcore.util.NullFromTypeParam public E remove(int index);

public int indexOf(@libcore.util.Nullable java.lang.Object o);

public int lastIndexOf(@libcore.util.Nullable java.lang.Object o);

@libcore.util.NonNull public java.util.ListIterator<E> listIterator();

@libcore.util.NonNull public java.util.ListIterator<E> listIterator(int index);

@libcore.util.NonNull public java.util.List<E> subList(int fromIndex, int toIndex);

@libcore.util.NonNull public default java.util.Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
}

